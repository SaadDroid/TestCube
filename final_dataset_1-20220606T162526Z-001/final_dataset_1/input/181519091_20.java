public void updateAvailableForGridMaking(@NonNull final Long sampleId, @NonNull final Boolean availabilityForGridMaking) {
        final Sample sample = repository.findOne(sampleId);
        if (sample == null) {
            LOGGER.info("[updateAvailableForGridMaking] Sample not found for ID: " + sampleId);
            throw new ResourceNotFoundException("Sample not found for ID: " + sampleId);
        }
        if (sample.getAvailableForGridMaking() == availabilityForGridMaking) {
            return;
        }
        sample.setAvailableForGridMaking(availabilityForGridMaking);
        repository.save(sample);
    }
