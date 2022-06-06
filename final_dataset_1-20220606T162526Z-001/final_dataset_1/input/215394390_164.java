@Override
    public EquatableValueSet union(BlockAllocator allocator, ValueSet other)
    {
        EquatableValueSet otherValueSet = checkCompatibility(other);
        boolean unionNullAllowed = this.isNullAllowed() || other.isNullAllowed();

        if (whiteList && otherValueSet.isWhiteList()) {
            return new EquatableValueSet(union(allocator, otherValueSet, this), true, unionNullAllowed);
        }
        else if (whiteList) {
            return new EquatableValueSet(subtract(allocator, otherValueSet, this), false, unionNullAllowed);
        }
        else if (otherValueSet.isWhiteList()) {
            return new EquatableValueSet(subtract(allocator, this, otherValueSet), false, unionNullAllowed);
        }
        else {
            return new EquatableValueSet(intersect(allocator, otherValueSet, this), false, unionNullAllowed);
        }
    }
