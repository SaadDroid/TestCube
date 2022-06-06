public void add(E element) {
        if (element == null) {
            throw new NullPointerException("Nulls are not permitted in this collection");
        }
        else {
            list.add(element);
        }
    }
