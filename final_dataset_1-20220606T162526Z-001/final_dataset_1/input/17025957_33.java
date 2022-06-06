public String getName() {
        if (this.name == null) {
            this.name = computeDefaultName(this.getClass());
        }
        return this.name;
    }
