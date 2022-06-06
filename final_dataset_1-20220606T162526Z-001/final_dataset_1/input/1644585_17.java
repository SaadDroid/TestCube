public DateTime asDateTime() {
        return new Rfc1123DateMatcher().getDateTime(this.getValue());
    }
