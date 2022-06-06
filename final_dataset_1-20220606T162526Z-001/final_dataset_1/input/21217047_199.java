@Override
    public final void remove() {
        if (!isRemoveSupported()) {
            throw new UnsupportedOperationException("Remove not supported");
        }
        else if (current != null) {
            remove(current);
            current = null;
        }
        else {
            throw new IllegalStateException("No current value to remove");
        }
    }
