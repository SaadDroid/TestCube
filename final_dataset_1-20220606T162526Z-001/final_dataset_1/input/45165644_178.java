public void consume() throws InterruptedException {

        Item item = queue.take();
        LOGGER.info("Consumer [{}] consume item [{}] produced by [{}]", name, item.getId(), item.getProducer());

    }
