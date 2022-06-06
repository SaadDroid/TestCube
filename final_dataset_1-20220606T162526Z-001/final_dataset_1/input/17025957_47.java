public void convertToDouble() {
        if (value.isPresent()) {
            String asString = String.valueOf(value.get());
            if (asString.isEmpty()) {
                this.value = Optional.of((double) 0);
                return;
            }
            try {
                this.value = Optional.of(Double.parseDouble(asString));
            } catch (NumberFormatException ex) {
                throw new NumberFormatException("Cannot convert column: "
                        + this.name + " with index " + this.index + " and value ->" + this.value + "<- to double");
            }
        }
    }
