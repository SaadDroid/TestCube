public <T> String serialize(T payload) {
        JSONObject payloadJsonObject = new JSONObject(payload);
        String jsonResponse = payloadJsonObject.toString();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < jsonResponse.length(); i++) {
            Character ch = jsonResponse.charAt(i);
            Character nextChar = null;
            if (i + 1 < jsonResponse.length()) {
                nextChar = jsonResponse.charAt(i + 1);
            }
            if ((Character.isLetter(ch) || Character.isDigit(ch)) && Character.isUpperCase(ch) &&
                ((Character.isLetter(nextChar) || Character.isDigit(nextChar)))) {
                stringBuilder.append('_');
                stringBuilder.append(Character.toLowerCase(ch));
            } else {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
