public String encodePassword(String normalPassword, String key) {
        return rotate(normalPassword);
    }
