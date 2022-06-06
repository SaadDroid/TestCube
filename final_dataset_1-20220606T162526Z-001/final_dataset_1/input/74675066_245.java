@Override
    public JWT parse(String payload) {
        try {
            // verify format
            SignedJWT signedJWT = SignedJWT.parse(payload);
            // verify signature
            boolean verified = signedJWT.verify(verifier);
            if (!verified) {
                throw new JOSEException("The signature was not verified");
            }
            Map<String, Object> claims = signedJWT
                    .getPayload()
                    .toJSONObject()
                    .entrySet()
                    .stream()
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            JWT jwt = new JWT(claims);
            // verify exp and nbf values
            // https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-30#section-4.1.4
            // token MUST NOT be accepted on or after any specified exp time
            Instant now = Instant.now();
            if (jwt.getExp() > 0) {
                Instant exp = Instant.ofEpochSecond(jwt.getExp());
                if (now.isAfter(exp)) {
                    long differenceMillis = now.toEpochMilli() - exp.toEpochMilli();
                    String msg = "JWT expired at " + exp + ". Current time: " + now + ", a difference of " +
                            differenceMillis + " milliseconds.  Allowed clock skew: " +
                            this.allowedClockSkewMillis + " milliseconds.";
                    throw new ExpiredJWTException(msg);
                }
            }
            // https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-30#section-4.1.5
            // token MUST NOT be accepted before any specified nbf time
            if (jwt.getNbf() > 0) {
                Instant nbf = Instant.ofEpochSecond(jwt.getNbf());
                if (now.isBefore(nbf)) {
                    long differenceMillis = nbf.toEpochMilli() - now.toEpochMilli();
                    String msg = "JWT must not be accepted before " + nbf + ". Current time: " + now +
                            ", a difference of " +
                            differenceMillis + " milliseconds.  Allowed clock skew: " +
                            this.allowedClockSkewMillis + " milliseconds.";
                    throw new PrematureJWTException(msg);
                }
            }
            return jwt;
        } catch (ParseException ex) {
            logger.debug("The following JWT token : {} is malformed", payload);
            throw new MalformedJWTException("Token is malformed", ex);
        } catch (ExpiredJWTException ex) {
            logger.debug("The following JWT token : {} is expired", payload);
            throw new ExpiredJWTException("Token is expired", ex);
        } catch (PrematureJWTException ex) {
            logger.debug("The following JWT token : {} must not be accepted (nbf)", payload);
            throw new PrematureJWTException("Token must not be accepted (nbf)", ex);
        } catch (JOSEException ex) {
            logger.debug("Verifying JWT token signature : {} has failed", payload);
            throw new SignatureException("Token's signature is invalid", ex);
        } catch (Exception ex) {
            logger.error("An error occurs while parsing JWT token : {}", payload, ex);
            throw ex;
        }
    }
