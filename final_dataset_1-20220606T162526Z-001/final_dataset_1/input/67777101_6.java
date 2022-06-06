public final void notifyItemRemovedAtPosition(int itemPosition) {
        final NotifyResult result = sectionManager.onItemRemoved(itemPosition);
        applyResult(result);
    }
