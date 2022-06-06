protected void validateXMLSchema(Message receivedMessage, TestContext context, XmlMessageValidationContext validationContext) {
        if (receivedMessage.getPayload() == null || !StringUtils.hasText(receivedMessage.getPayload(String.class))) {
            return;
        }

        try {
            Document doc = XMLUtils.parseMessagePayload(receivedMessage.getPayload(String.class));

            if (!StringUtils.hasText(doc.getFirstChild().getNamespaceURI())) {
                return;
            }

            log.debug("Starting XML schema validation ...");

            XmlValidator validator = null;
            XsdSchemaRepository schemaRepository = null;
            if (validationContext.getSchema() != null) {
                validator = context.getReferenceResolver().resolve(validationContext.getSchema(), XsdSchema.class).createValidator();
            } else if (validationContext.getSchemaRepository() != null) {
                schemaRepository = context.getReferenceResolver().resolve(validationContext.getSchemaRepository(), XsdSchemaRepository.class);
            } else if (schemaRepositories.size() == 1) {
                schemaRepository = schemaRepositories.get(0);
            } else if (schemaRepositories.size() > 0) {
                for (XsdSchemaRepository repository : schemaRepositories) {
                    if (repository.canValidate(doc)) {
                        schemaRepository = repository;
                    }
                }

                if (schemaRepository == null) {
                    throw new CitrusRuntimeException(String.format("Failed to find proper schema repository in Spring bean context for validating element '%s(%s)'",
                            doc.getFirstChild().getLocalName(), doc.getFirstChild().getNamespaceURI()));
                }
            } else {
                log.warn("Neither schema instance nor schema repository defined - skipping XML schema validation");
                return;
            }

            if (schemaRepository != null) {
                if (!schemaRepository.canValidate(doc)) {
                    throw new CitrusRuntimeException(String.format("Unable to find proper XML schema definition for element '%s(%s)' in schema repository '%s'",
                            doc.getFirstChild().getLocalName(),
                            doc.getFirstChild().getNamespaceURI(),
                            schemaRepository.getName()));
                }

                List<Resource> schemas = new ArrayList<>();
                for (XsdSchema xsdSchema : schemaRepository.getSchemas()) {
                    if (xsdSchema instanceof XsdSchemaCollection) {
                        for (Resource resource : ((XsdSchemaCollection) xsdSchema).getSchemaResources()) {
                            schemas.add(resource);
                        }
                    } else if (xsdSchema instanceof WsdlXsdSchema) {
                        for (Resource resource : ((WsdlXsdSchema) xsdSchema).getSchemaResources()) {
                            schemas.add(resource);
                        }
                    } else {
                        synchronized (transformerFactory) {
                            ByteArrayOutputStream bos = new ByteArrayOutputStream();
                            try {
                                transformerFactory.newTransformer().transform(xsdSchema.getSource(), new StreamResult(bos));
                            } catch (TransformerException e) {
                                throw new CitrusRuntimeException("Failed to read schema " + xsdSchema.getTargetNamespace(), e);
                            }
                            schemas.add(new ByteArrayResource(bos.toByteArray()));
                        }
                    }
                }

                validator = XmlValidatorFactory.createValidator(schemas.toArray(new Resource[schemas.size()]), WsdlXsdSchema.W3C_XML_SCHEMA_NS_URI);
            }

            SAXParseException[] results = validator.validate(new DOMSource(doc));
            if (results.length == 0) {
                log.info("XML schema validation successful: All values OK");
            } else {
                log.error("XML schema validation failed for message:\n" +
                        XMLUtils.prettyPrint(receivedMessage.getPayload(String.class)));

                // Report all parsing errors
                log.debug("Found " + results.length + " schema validation errors");
                StringBuilder errors = new StringBuilder();
                for (SAXParseException e : results) {
                    errors.append(e.toString());
                    errors.append("\n");
                }
                log.debug(errors.toString());

                throw new ValidationException("XML schema validation failed:", results[0]);
            }
        } catch (IOException e) {
            throw new CitrusRuntimeException(e);
        }
    }
