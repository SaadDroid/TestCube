public static StatementOptionsBuilder retryPolicy(RetryPolicy policy) {
        return new StatementOptionsBuilder().withRetryPolicy(policy);
    }
