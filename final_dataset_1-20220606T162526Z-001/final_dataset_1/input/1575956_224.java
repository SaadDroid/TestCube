public void recycle() {
        clear();
        if (handle != null) {
            handle.recycle(this);
        }
    }
