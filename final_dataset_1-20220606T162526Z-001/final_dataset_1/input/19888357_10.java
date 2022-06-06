@Override
    public List<CartItem> getCartItems(String cartId) {
        Assert.notNull(cartId, "CartId mustn't be null");
        URI get_uri = GET_TEMPLATE.expand(cartId);
        Cart cart = restTemplate.getForObject(get_uri, Cart.class);
        return cart.getCartItems();
    }
