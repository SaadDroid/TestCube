public static void main(String[] args) {
        Stack<StarMemento> states = new Stack<>();

        Star star = new Star(StarType.SUN, 10000000, 500000);
        LOGGER.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        LOGGER.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        LOGGER.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        LOGGER.info(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        LOGGER.info(star.toString());
        while (states.size() > 0) {
            star.setMemento(states.pop());
            LOGGER.info(star.toString());
        }
    }
