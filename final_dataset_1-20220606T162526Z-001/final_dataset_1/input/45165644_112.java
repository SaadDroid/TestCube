@Override
    public String perform() throws BusinessException {
        if (!this.errors.isEmpty()) {
            throw this.errors.pop();
        }

        return this.customerId;
    }
