public String decodePassword(String encodedPassword, String key) {
        return rotate(encodedPassword);
    }
