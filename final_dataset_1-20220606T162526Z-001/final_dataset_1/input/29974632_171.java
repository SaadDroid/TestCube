@Override
    public ValidationResult<?> validate(final PowerPointConfig powerPointConfig) {
        try {
            powerPointConfig.basicValidate(null);
        } catch (final ConfigException ignored) {
            return new ValidationResult<>(false, Validation.CONFIGURATION_INVALID);
        }

        final String templateFile = powerPointConfig.getTemplateFile();
        if (StringUtils.isNotBlank(templateFile)) {
            try {
                powerPointService.validateTemplate();
            } catch (final TemplateLoadException ignored) {
                return new ValidationResult<>(false, Validation.TEMPLATE_INVALID);
            }
        }

        return new ValidationResult<>(true, null);
    }
