@Override
    public void updateFromPmo() {
        try {
            aspectUpdaters.updateUI();
            componentWrapper.postUpdate();
            // CSOFF: IllegalCatch
        } catch (RuntimeException e) {
            throw new LinkkiBindingException(
                    "Error while updating UI (" + e.getMessage() + ") in "
                            + toString(),
                    e);
        }
        // CSON: IllegalCatch
    }
