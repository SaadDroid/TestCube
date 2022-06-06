public int getPrice(String name) {
        log.debug("getPrice : name : {}", name);
        // 측정 시작
        StopWatch sw = new StopWatch();
        sw.start();

        int price = productDao.getPrice(name);

        // 측정 종료
        sw.stop();

        System.out.format("Seconds=%1$s, value=%2$s%n",
                sw.getTotalTimeSeconds(), price);
        return price;
    }
