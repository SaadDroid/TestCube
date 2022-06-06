public int getPage() {
        return pageSize > 0 ? (startRow / pageSize) + 1 : UNKNOWN;
    }
