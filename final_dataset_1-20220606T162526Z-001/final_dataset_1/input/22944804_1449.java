public LoginProcess next(Callback[] callbacks) throws AuthLoginException {

        AuthIndexType indexType = authContext.getIndexType();
        if (indexType == null) {
            indexType = loginConfiguration.getIndexType();
        }

        if (AuthIndexType.LEVEL.equals(indexType) || AuthIndexType.COMPOSITE.equals(indexType)) {

            String choice = null;

            for (Callback responseCallback : callbacks) {
                if (responseCallback instanceof ChoiceCallback) {
                    int selectedIndex = ((ChoiceCallback) responseCallback).getSelectedIndexes()[0];
                    choice = ((ChoiceCallback) responseCallback).getChoices()[selectedIndex];
                    break;
                }
            }

            String indexValue = coreServicesWrapper.getDataFromRealmQualifiedData(choice);
            String qualifiedRealm = coreServicesWrapper.getRealmFromRealmQualifiedData(choice);
            if ((qualifiedRealm != null) && (qualifiedRealm.length() != 0)) {
                String orgDN = coreServicesWrapper.orgNameToDN(qualifiedRealm);
                authContext.setOrgDN(orgDN);
            }

            int type = coreServicesWrapper.getCompositeAdviceType(authContext);

            if (type == AuthUtils.MODULE) {
                indexType = AuthIndexType.MODULE;
            } else if (type == AuthUtils.SERVICE) {
                indexType = AuthIndexType.SERVICE;
            } else if (type == AuthUtils.REALM) {
                indexType = AuthIndexType.SERVICE;
                String orgDN = coreServicesWrapper.orgNameToDN(choice);
                indexValue = coreServicesWrapper.getOrgConfiguredAuthenticationChain(orgDN);
                authContext.setOrgDN(orgDN);
            } else {
                indexType = AuthIndexType.MODULE;
            }

            loginConfiguration.indexType(indexType);
            loginConfiguration.indexValue(indexValue);

            return loginAuthenticator.startLoginProcess(this);

        } else {
            authContext.submitRequirements(callbacks);
            return this;
        }
    }
