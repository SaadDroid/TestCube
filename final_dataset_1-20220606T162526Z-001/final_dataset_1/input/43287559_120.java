@Override
    public final void setFallbackPolicy(Policy policy) {
        if (getFallbackPolicy() != null) {
            getFallbackPolicy().setFallbackPolicy(policy);
        } else {
            super.setFallbackPolicy(policy);
        }
    }
