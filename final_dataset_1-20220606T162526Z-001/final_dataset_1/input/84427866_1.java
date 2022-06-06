public CheckoutResult checkOut() throws Exception {
        CheckoutResult checkOutResult = new CheckoutResult();

        // 检查可用库存
        ShoppingCart currentCart = null;
        try {
            currentCart = getShoppingCart();
        }catch (Exception e) {
            log.error("获取购物车失败", e);
        }

        if(currentCart != null) {
            // 协调当前购物车与库存
            Inventory[] inventory = oAuth2RestTemplate.getForObject(String.format("http://inventory-service/v1/inventory?productIds=%s", currentCart.getCartItems()
                    .stream()
                    .map(CartItem::getProductId)
                    .collect(Collectors.joining(","))), Inventory[].class);

            if(inventory != null) {
                Map<String, Long> inventoryItems = Arrays.stream(inventory)
                        .map(inv -> inv.getProduct().getProductId())
                        .collect(groupingBy(Function.identity(), counting()));
                        /*.collect(Collectors.groupingBy(
                                (inv -> inv.getProduct().getProductId()), Collectors.counting()));*/

                if(checkAvailableInventory(checkOutResult, currentCart, inventoryItems)) {
                    // 预定库存 Reserve the available inventory

                    // 创建订单
                    Order order = oAuth2RestTemplate.postForObject("http://order-service/v1/orders",
                            currentCart.getCartItems()
                                    .stream()
                                    .map(cartItem -> new OrderItem(cartItem.getProduct().getName(), cartItem.getProductId(),
                                            cartItem.getQuantity(), cartItem.getProduct().getUnitPrice(), TAX))
                                    .collect(Collectors.toList()),
                            Order.class);

                    if(order != null) {
                        // 订单创建成功
                        checkOutResult.setResultMessage("订单已成功创建");

                        // 增加订单事件
                        oAuth2RestTemplate.postForEntity(
                                String.format("http://order-service/v1/orders/%s/events", order.getOrderId()),
                                new OrderEvent(OrderEventType.CREATED, order.getOrderId()), ResponseEntity.class);

                        checkOutResult.setOrder(order);

                        User user = oAuth2RestTemplate.getForObject("http://user-service/auth/v1/me", User.class);

                        // 增加CartEventType.CHECKOUT事件，清除购物车，因为已经生成订单成功
                        addCartEvent(new CartEvent(CartEventType.CHECKOUT, user.getId()), user);
                    }
                }
            }
        }

        // 返回检出结果：要么库存不足，要么检出成功
        return checkOutResult;
    }
