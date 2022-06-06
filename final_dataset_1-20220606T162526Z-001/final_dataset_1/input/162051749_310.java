@Override
    public List<Annotation> getAnnotations(String text) {
        List<? extends Annotation> annotations = TAGGER.getAnnotations(text);
        List<Annotation> fixedAnnotations = new ArrayList<>();

        Set<String> inSentence = getInSentenceCandidates(text, annotations);
        inSentence = CollectionHelper.filterSet(inSentence, new Predicate<String>() {
            @Override
            public boolean test(String item) {
                return getLowercaseRatio(item) <= lowercaseThreshold;
            }
        });
        if (inSentence.isEmpty()) { // do not try to fix any phrases, if we do not have any sentences at all (#294)
            fixedAnnotations.addAll(annotations);
            return fixedAnnotations;
        }

        for (Annotation annotation : annotations) {
            String value = annotation.getValue();
            // only annotations at sentence start are processed, but if the annotation also occurs within a sentence, no
            // processing is required
            if (isWithinSentence(text, annotation)) {
                fixedAnnotations.add(annotation);
                continue;
            }
            if (inSentence.contains(value)) {
                LOGGER.trace("Skip '{}', because it appears within a sentence", value);
                fixedAnnotations.add(annotation);
                continue;
            }
            String[] parts = value.split("\\s");
            if (parts.length == 1) { // filtering of single token annotations
                double lcRatio = getLowercaseRatio(value);
                if (lcRatio > lowercaseThreshold) {
                    LOGGER.debug("Drop '{}' because of lc/uc ratio of {}", value, lcRatio);
                    continue;
                }
            } else { // filtering/offset correction of multi-token annotations
                // sliding cut, FIXME double spaces?
                LOGGER.trace("Start correcting '{}'", value);
                int offsetCut = 0;
                String newValue = value;
                for (String token : parts) {
                    double lcRatio = getLowercaseRatio(token);
                    if (lcRatio <= lowercaseThreshold) {
                        LOGGER.trace("Stop correcting '{}' at '{}' because of lc/uc ratio of {}", new Object[] {value,
                                newValue, lcRatio});
                        break;
                    }
                    offsetCut += token.length() + 1;
                    if (offsetCut >= value.length()) {
                        break;
                    }
                    newValue = value.substring(offsetCut);
                    if (inSentence.contains(newValue)) {
                        LOGGER.trace("Stop correcting '{}' as '{}' is contained within sentence", value, newValue);
                        break;
                    }
                }
                if (offsetCut >= value.length()) {
                    LOGGER.debug("Drop '{}' completely because of lc/uc ratio", value);
                    continue;
                } else if (offsetCut > 0) { // annotation start was corrected
                    LOGGER.debug("Correct '{}' to '{}' because of lc/uc ratios", value, newValue);
                    int newStart = annotation.getStartPosition() + offsetCut;
                    fixedAnnotations.add(new ImmutableAnnotation(newStart, newValue, annotation.getTag()));
                    continue;
                }
            }
            fixedAnnotations.add(annotation);
        }
        LOGGER.debug("Reduced from {} to {} with case dictionary", annotations.size(), fixedAnnotations.size());

        if (longAnnotationSplit > 0) {
            List<Annotation> additionalAnnotations = getLongAnnotationSplit(fixedAnnotations, longAnnotationSplit);
            LOGGER.debug("Extracted additional {} annotations by splitting", additionalAnnotations.size());
            fixedAnnotations.addAll(additionalAnnotations);
        }

        return fixedAnnotations;
    }
