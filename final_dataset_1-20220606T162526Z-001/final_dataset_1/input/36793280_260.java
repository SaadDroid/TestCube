@Override
    public CircuitBreaker circuitBreaker(String name) {
        return circuitBreaker(name, getDefaultConfig());
    }
