public boolean isValid(String token, String secret) {
        if(StringUtils.hasText(token) && StringUtils.hasText(secret)) {
            try {
                String secret2 = new String(Base64.encodeBase64(secret.getBytes()));
                Jwts.parser().setSigningKey(secret2).parseClaimsJws(token);
                return true;
            } catch (JwtException e) {
                LOGGER.error(e.getMessage());
            }
        }
        return false;
    }
