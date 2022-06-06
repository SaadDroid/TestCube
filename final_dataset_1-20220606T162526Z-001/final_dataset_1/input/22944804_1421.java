public <T extends Callback> RestAuthCallbackHandler getRestAuthCallbackHandler(Class<T> callbackClass) throws RestAuthException {

        if (HiddenValueCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthHiddenValueCallbackHandler();
        } else if (NameCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthNameCallbackHandler();
        } else if (PasswordCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthPasswordCallbackHandler();
        } else if (ChoiceCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthChoiceCallbackHandler();
        } else if (ConfirmationCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthConfirmationCallbackHandler();
        } else if (HttpCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthHttpCallbackHandler();
        } else if (LanguageCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthLanguageCallbackHandler();
        } else if (RedirectCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthRedirectCallbackHandler();
        } else if (TextInputCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthTextInputCallbackHandler();
        } else if (TextOutputCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthTextOutputCallbackHandler();
        } else if (X509CertificateCallback.class.isAssignableFrom(callbackClass)) {
            return new RestAuthX509CallbackHandler();
        }

        DEBUG.error(MessageFormat.format("Unsupported Callback, {0}", callbackClass.getSimpleName()));
        throw new RestAuthException(ResourceException.INTERNAL_ERROR,
                MessageFormat.format("Unsupported Callback, {0}", callbackClass.getSimpleName()));
    }
