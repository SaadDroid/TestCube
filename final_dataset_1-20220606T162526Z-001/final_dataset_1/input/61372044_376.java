public void processParameters(final BaseCmd cmd, final Map params) {
        final Map<Object, AccessType> entitiesToAccess = new HashMap<>();

        final List<Field> cmdFields = cmd.getParamFields();

        for (final Field field : cmdFields) {
            final Parameter parameterAnnotation = field.getAnnotation(Parameter.class);
            final Object paramObj = params.get(parameterAnnotation.name());
            if (paramObj == null) {
                if (parameterAnnotation.required()) {
                    throw new ServerApiException(ApiErrorCode.PARAM_ERROR, "Unable to execute API command " +
                            cmd.getCommandName().substring(0, cmd.getCommandName().length() - 8) +
                            " due to missing parameter " + parameterAnnotation.name());
                }
                continue;
            }

            // marshall the parameter into the correct type and set the field value
            try {
                setFieldValue(field, cmd, paramObj, parameterAnnotation);
            } catch (final IllegalArgumentException argEx) {
                if (s_logger.isDebugEnabled()) {
                    s_logger.debug("Unable to execute API command " + cmd.getCommandName() + " due to invalid value " + paramObj + " for parameter " +
                            parameterAnnotation.name());
                }
                throw new ServerApiException(ApiErrorCode.PARAM_ERROR, "Unable to execute API command " +
                        cmd.getCommandName().substring(0, cmd.getCommandName().length() - 8) + " due to invalid value " + paramObj + " for parameter " +
                        parameterAnnotation.name());
            } catch (final ParseException parseEx) {
                if (s_logger.isDebugEnabled()) {
                    s_logger.debug("Invalid date parameter " + paramObj + " passed to command " + cmd.getCommandName().substring(0, cmd.getCommandName().length() - 8));
                }
                throw new ServerApiException(ApiErrorCode.PARAM_ERROR, "Unable to parse date " + paramObj + " for command " +
                        cmd.getCommandName().substring(0, cmd.getCommandName().length() - 8) + ", please pass dates in the format mentioned in the api documentation");
            } catch (final InvalidParameterValueException invEx) {
                throw new ServerApiException(ApiErrorCode.PARAM_ERROR, "Unable to execute API command " +
                        cmd.getCommandName().substring(0, cmd.getCommandName().length() - 8) + " due to invalid value. " + invEx.getMessage());
            } catch (final CloudRuntimeException cloudEx) {
                s_logger.error("CloudRuntimeException", cloudEx);
                // FIXME: Better error message? This only happens if the API command is not executable, which typically
                //means
                // there was
                // and IllegalAccessException setting one of the parameters.
                throw new ServerApiException(ApiErrorCode.INTERNAL_ERROR, "Internal error executing API command " +
                        cmd.getCommandName().substring(0, cmd.getCommandName().length() - 8));
            }

            //check access on the resource this field points to
            try {
                final ACL checkAccess = field.getAnnotation(ACL.class);
                final CommandType fieldType = parameterAnnotation.type();

                if (checkAccess != null) {
                    // Verify that caller can perform actions in behalf of vm
                    // owner acumulate all Controlled Entities together.
                    // parse the array of resource types and in case of map
                    // check access on key or value or both as specified in @acl
                    // implement external dao for classes that need findByName
                    // for maps, specify access to be checkd on key or value.
                    // Find the controlled entity DBid by uuid

                    if (parameterAnnotation.entityType() != null && parameterAnnotation.entityType().length > 0
                            && parameterAnnotation.entityType()[0].getAnnotation(EntityReference.class) != null) {
                        final Class<?>[] entityList = parameterAnnotation.entityType()[0].getAnnotation(EntityReference.class).value();

                        // Check if the parameter type is a single
                        // Id or list of id's/name's
                        switch (fieldType) {
                            case LIST:
                                final CommandType listType = parameterAnnotation.collectionType();
                                switch (listType) {
                                    case LONG:
                                    case UUID:
                                        final List<Long> listParam = (List<Long>) field.get(cmd);
                                        for (final Long entityId : listParam) {
                                            for (final Class entity : entityList) {
                                                final Object entityObj = _entityMgr.findById(entity, entityId);
                                                if (entityObj != null) {
                                                    entitiesToAccess.put(entityObj, checkAccess.accessType());
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    /*
                                     * case STRING: List<String> listParam = new
                                     * ArrayList<String>(); listParam =
                                     * (List)field.get(cmd); for(String entityName:
                                     * listParam){ ControlledEntity entityObj =
                                     * (ControlledEntity )daoClassInstance(entityId);
                                     * entitiesToAccess.add(entityObj); } break;
                                     */
                                    default:
                                        break;
                                }
                                break;
                            case LONG:
                            case UUID:
                                for (final Class entity : entityList) {
                                    final Object entityObj = _entityMgr.findById(entity, (Long) field.get(cmd));
                                    if (entityObj != null) {
                                        entitiesToAccess.put(entityObj, checkAccess.accessType());
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    }
                }
            } catch (final IllegalArgumentException e) {
                s_logger.error("Error initializing command " + cmd.getCommandName() + ", field " + field.getName() + " is not accessible.");
                throw new CloudRuntimeException("Internal error initializing parameters for command " + cmd.getCommandName() + " [field " + field.getName() +
                        " is not accessible]");
            } catch (final IllegalAccessException e) {
                s_logger.error("Error initializing command " + cmd.getCommandName() + ", field " + field.getName() + " is not accessible.");
                throw new CloudRuntimeException("Internal error initializing parameters for command " + cmd.getCommandName() + " [field " + field.getName() +
                        " is not accessible]");
            }
        }

        doAccessChecks(cmd, entitiesToAccess);
    }
