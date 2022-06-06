boolean isString() {
        return this.value.isPresent() && this.value.get() instanceof String;
    }
