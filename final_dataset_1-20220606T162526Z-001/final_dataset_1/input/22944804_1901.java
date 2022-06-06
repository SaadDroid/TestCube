@Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CustomTokenOperation) {
            CustomTokenOperation otherOperation = (CustomTokenOperation)other;
            return customTokenName.equals(otherOperation.customTokenName)
                    && customOperationClassName.equals(otherOperation.customOperationClassName);
        }
        return false;
    }
