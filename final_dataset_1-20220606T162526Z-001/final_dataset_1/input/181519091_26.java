public <U extends Persistable<Long>> void saveDefaultValues(@NonNull final Project project, @NonNull final U entity) {
        final GP2SDefaultType annotation = entity.getClass()
                .getAnnotation(GP2SDefaultType.class);
        Objects.requireNonNull(annotation, "Missing GP2SDefaultType annotation");

        Arrays.stream(entity.getClass()
                .getDeclaredFields())
                .filter(this::isGp2sDefaultAnnotationPresent)
                .map(field -> DefaultValue.builder()
                        .entityType(annotation.value())
                        .project(project)
                        .fieldName(field.getName())
                        .value(getFieldValue(entity, field))
                        .build())
                .filter(defaultValue -> defaultValue.getValue() != null)
                .map(this::mapToExistingIfPresent)
                .forEach(defaultValue -> repository.save(defaultValue));

        Arrays.stream(entity.getClass()
                .getDeclaredFields())
                .filter(this::isGp2sDefaultCompositeAnnotationPresent)
                .forEach(field -> createAndSaveCompositeDefaultValues(project, annotation.value(), entity, field));
    }
