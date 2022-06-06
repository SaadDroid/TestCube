public boolean isRedirectUriLocalhostAllowed() {
        return this.getOidc()!=null &&
                this.getOidc().getClientRegistrationSettings()!=null &&
                this.getOidc().getClientRegistrationSettings().isAllowLocalhostRedirectUri();
    }
