void createGuest(int count, Coffee coffee, int maxCoffeeCount) {
        for (int i = 0; i < count; i++) {
            coffeeHouse.tell(new CoffeeHouse.CreateGuest(coffee), ActorRef.noSender());
        }
    }
