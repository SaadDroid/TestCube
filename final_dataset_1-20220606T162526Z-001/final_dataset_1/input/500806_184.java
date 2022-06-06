@When("^(?:user )?(?:sets?|puts?) text \"([^\"]+)\" to (?:element|input|textfield) with ([^\"]+)=\"([^\"]+)\"$")
    public void setInput(String text, String property, String value) {
        runner.run(selenium().browser(browser)
                .setInput(text)
                .element(property, value));
    }
