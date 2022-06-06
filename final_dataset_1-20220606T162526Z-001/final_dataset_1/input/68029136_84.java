public String getPropertyDisplayName() {
        if (this.displayName == null || this.displayName.isEmpty()) {
            return this.technicalKey;
        }
        return displayName;
    }
