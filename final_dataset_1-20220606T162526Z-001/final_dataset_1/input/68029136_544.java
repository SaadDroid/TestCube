public List<ResourceEntity> getBatchJobProvidedResources(List<String> apps) {
        if (apps == null || apps.isEmpty()) {
            return null;
        }
        try {
            return resourceRepository.getBatchJobProvidedResources(apps);
        } catch (NoResultException e) {
            return null;
        }
    }
