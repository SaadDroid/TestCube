void execute() {
            Endpoint endpoint=changeRequest.getEndpoint();
            String host = endpoint.getHost();
            try {
                LOGGER.debug("Executing request for: " + host);

                // Connection for each endpoint
                LdapConnectionResult ldapConnectionResult = driverGetInstance().connect(endpoint);

                for (ModificationDetails modificationDetails : changeRequest.getModificationDetailsList()) {
                    Modification modification = apacheAPIConverter.toModification(modificationDetails);

                    ldapConnectionResult.getConnection().modify(modificationDetails.getDn(), modification);
                }

            } catch (LdapException | BaseException e) {
                LOGGER.error("Change Execution failed for Endpoint: " + host, e);
                endpoint.setDestinationType(DestinationType.NONE);
                throw new ChangeRequestFailedException(e.getMessage(), host);
            }
    }
