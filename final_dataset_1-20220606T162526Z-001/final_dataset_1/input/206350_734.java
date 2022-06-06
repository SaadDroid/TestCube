@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ASTScalar other = (ASTScalar) o;
        return value != null ? value.equals(other.value) : other.value == null;
    }
