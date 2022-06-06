@Override
    public String getPublicKeyByRealm(String realm) {
        String key = generateKey(realm);
        logger.info("Trying to get public key for realm `{}`", key);
        return redisTemplate.opsForValue().get(key);
    }
