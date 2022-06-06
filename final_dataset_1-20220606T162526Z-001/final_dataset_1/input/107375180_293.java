public boolean isAssignableFrom(@CheckForNull WrapperType type) {
        return this.equals(type) || (type != null && isAssignableFrom(type.getParent()));
    }
