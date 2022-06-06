static Scenario scenario(String text) {
        reset();
        final Scenario scenario = new Scenario(text);
        sRoot = scenario;
        return scenario;
    }
