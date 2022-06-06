@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj instanceof RawConfiguration) {
            RawConfiguration that = (RawConfiguration) obj;
            if (this.sha256 != null && this.sha256.equals(that.sha256)) {
                if (this.path == null && that.path == null) {
                    return true;
                }
                if ((this.path != null && that.path != null) && this.path.equals(that.path)) {
                    return true;
                }
            }
        }
        return false;
    }
