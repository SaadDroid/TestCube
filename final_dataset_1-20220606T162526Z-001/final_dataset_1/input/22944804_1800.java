public boolean isValid(SigningHandler signingHandler) {
        if (isSignatureValid == null) {
            isSignatureValid = jwt.verify(signingHandler);
        }
        return isSignatureValid && isContentValid();
    }
