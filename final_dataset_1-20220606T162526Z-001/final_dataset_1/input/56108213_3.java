public static boolean booleanEquals(@Nullable final Boolean lhs, @Nullable final Boolean rhs) {
        return lhs == null && rhs == null || lhs != null && rhs != null && lhs.equals(rhs);
    }
