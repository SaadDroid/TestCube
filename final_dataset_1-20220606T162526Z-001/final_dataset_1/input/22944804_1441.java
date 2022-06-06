public LoginStage getLoginStage() {

        boolean isLevelOrCompositeIndexType = AuthIndexType.LEVEL.equals(loginConfiguration.getIndexType())
                || AuthIndexType.COMPOSITE.equals(loginConfiguration.getIndexType());

        if ((isLevelOrCompositeIndexType && authContext.getRequirements() == null) || !isLevelOrCompositeIndexType) {
            authContext.hasMoreRequirements();
        }

        if (AuthContext.Status.IN_PROGRESS.equals(authContext.getStatus())) {
            return LoginStage.REQUIREMENTS_WAITING;
        } else {
            return LoginStage.COMPLETE;
        }
    }
