public T getItem(int position) {
        if (isLastPosition(position)) {
            previous();
        }
        return itemList.get(position);
    }
