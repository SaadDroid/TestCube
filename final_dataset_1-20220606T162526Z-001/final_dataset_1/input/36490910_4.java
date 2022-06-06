public void setItemsLineWidth(int itemLineWidth) {
        if (itemLineWidth <= 0)
            throw new IllegalArgumentException("itemLineWidth must be greater than 0");
        this.itemsLineWidth = itemLineWidth;
        invalidate();
    }
