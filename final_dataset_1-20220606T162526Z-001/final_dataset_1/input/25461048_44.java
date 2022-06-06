public void iterateMap() {
        Set<String> keys = accounts.keySet();
        for (String key : keys) {
            System.out.println("Key : " + key + ", value: " + accounts.get(key));
        }
    }
