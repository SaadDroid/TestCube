static Given given(String text) {
        reset();
        final Given given = new Given(text);
        sRoot = given;
        return given;
    }
