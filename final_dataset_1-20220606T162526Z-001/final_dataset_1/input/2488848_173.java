@SuppressWarnings("unchecked")
    public OrderSpecifier asc() {
        if (asc == null) {
            asc = new OrderSpecifier(Order.ASC, this);
        }
        return asc;
    }
