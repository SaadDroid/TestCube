public void verifyEditableByOwner(ForeignableOwner editingOwner, int beforeChangeForeignableHashCode,  Foreignable<?> afterChangeForeignable) throws ForeignableOwnerViolationException {
        if (!isNewObject(afterChangeForeignable)
                && !isForeignableModifiableByOwner(editingOwner, afterChangeForeignable)
                && !hasOnlyDecorationsChanged(beforeChangeForeignableHashCode, afterChangeForeignable)) {
            throw new ForeignableOwnerViolationException(afterChangeForeignable, editingOwner, "Edit foreignable object not allowed by this owner");
        }
    }
