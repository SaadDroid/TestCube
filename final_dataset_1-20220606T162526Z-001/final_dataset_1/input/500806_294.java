@Override
    public void validateMessage(Message receivedMessage, Message controlMessage, TestContext context, HeaderValidationContext validationContext) {
        Map<String, Object> controlHeaders = controlMessage.getHeaders();
        Map<String, Object> receivedHeaders = receivedMessage.getHeaders();

        if (CollectionUtils.isEmpty(controlHeaders)) { return; }

        log.debug("Start message header validation ...");

        for (Map.Entry<String, Object> entry : controlHeaders.entrySet()) {
            if (MessageHeaderUtils.isSpringInternalHeader(entry.getKey()) ||
                    entry.getKey().startsWith(MessageHeaders.MESSAGE_PREFIX) ||
                    entry.getKey().equals(EndpointUriResolver.ENDPOINT_URI_HEADER_NAME) ||
                    entry.getKey().equals(EndpointUriResolver.REQUEST_PATH_HEADER_NAME) ||
                    entry.getKey().equals(EndpointUriResolver.QUERY_PARAM_HEADER_NAME)) {
                continue;
            }

            final String headerName = getHeaderName(entry.getKey(), receivedHeaders, context, validationContext);

            if (!receivedHeaders.containsKey(headerName)) {
                throw new ValidationException("Validation failed: Header element '" + headerName + "' is missing");
            }

            Object controlValue = entry.getValue();
            validationContext.getValidators()
                    .stream()
                    .filter(validator -> validator.supports(headerName, Optional.ofNullable(controlValue).map(Object::getClass).orElse(null)))
                    .findFirst()
                    .orElse(
                        validationContext.getValidatorNames()
                                .stream()
                                .map(beanName -> {
                                    try {
                                        return context.getReferenceResolver().resolve(beanName, HeaderValidator.class);
                                    } catch (NoSuchBeanDefinitionException e) {
                                        log.warn("Failed to resolve header validator for name: " + beanName);
                                        return null;
                                    }
                                })
                                .filter(Objects::nonNull)
                                .filter(validator -> validator.supports(headerName, Optional.ofNullable(controlValue).map(Object::getClass).orElse(null)))
                                .findFirst()
                                .orElse(
                                    getHeaderValidators(context).stream()
                                            .filter(validator -> validator.supports(headerName, Optional.ofNullable(controlValue).map(Object::getClass).orElse(null)))
                                            .findFirst()
                                            .orElse(new DefaultHeaderValidator())
                                )
                    ).validateHeader(headerName, receivedHeaders.get(headerName), controlValue, context, validationContext);
        }

        log.info("Message header validation successful: All values OK");
    }
