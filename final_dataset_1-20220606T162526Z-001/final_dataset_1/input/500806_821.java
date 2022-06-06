public boolean authenticate(String pUser, PublicKey pKey, ServerSession pSession) {
        return user != null && user.equals(pUser) && allowedKey.equals(pKey);
    }
