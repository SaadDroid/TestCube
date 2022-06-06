@JsonIgnore
    public void setRetryPolicy(org.apache.curator.RetryPolicy retryPolicy) {
        _setterRetryPolicy = Optional.of(retryPolicy);
    }
