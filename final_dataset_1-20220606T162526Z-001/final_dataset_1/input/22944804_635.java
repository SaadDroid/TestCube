public Token toToken(JsonValue request) {
        assertObjectIsAMap(request);
        Set<String> idSet = (Set<String>) request.get(TokenIdFactory.ID).getObject();
        String id = null;
        if (idSet != null && !idSet.isEmpty()){
            id = tokenIdFactory.generateTokenId(idSet.iterator().next());
        } else {
            id = tokenIdFactory.generateTokenId(null);
        }
        request.get(TokenIdFactory.ID).setObject(id);
        Token token = new Token(id, TokenType.OAUTH);

        // For each OAuth attribute, assign it to the token.
        Map<String,Object> values = request.asMap();
        if (values != null) {
            for (OAuthTokenField field : OAuthTokenField.values()) {
                String key = field.getOAuthField();
                if (values.containsKey(key)) {

                    Object value = values.get(key);
                    /**
                     * OAuthTokenField aware conversions.
                     *
                     * - Skip the ID as it is extracted by the TokenIdFactory.
                     * - Dates are formatted as milliseconds from epoch, and stored in Collections.
                     * - All other fields are stored in Collections which can be empty.
                     * - (just in case) If a field is not in a collection, assume it is the right type.
                     */
                    if (OAuthTokenField.ID.getOAuthField().equals(key)) {
                        continue;
                    }
                    if (OAuthTokenField.EXPIRY_TIME.getOAuthField().equals(key)) {

                        if (!Collection.class.isAssignableFrom(value.getClass())) {
                            throw new IllegalStateException("Date must be in a collection");
                        }

                        if (isSetToNeverExpire((Collection<String>) value)) {
                            continue;
                        }
                        value = oAuthValues.getDateValue((Collection<String>) value);
                    } else if (value instanceof Collection) {
                        value = oAuthValues.getSingleValue((Collection<String>) value);
                    }
                    token.setAttribute(field.getField(), value);
                }
            }
        }

        /**
         * Binary Data
         * The JsonValue class is unable to parse its own output, therefore we need
         * a suitable mechanism to work around this. In this case we will serialise
         * the object contained within the JsonValue which we know to be a map.
         */
        Object objectToStore = request.getObject();
        String serialisedObject = serialisation.serialise(objectToStore);
        blobUtils.setBlobFromString(token, serialisedObject);

        return token;
    }
