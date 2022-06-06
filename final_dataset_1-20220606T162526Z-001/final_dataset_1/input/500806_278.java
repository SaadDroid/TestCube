@Override
    protected final void execute(SeleniumBrowser browser, TestContext context) {
        WebElement element = browser.getWebDriver().findElement(createBy(context));

        if (element == null) {
            throw new CitrusRuntimeException(String.format("Failed to find element '%s' on page", property + "=" + propertyValue));
        }

        validate(element, browser, context);

        execute(element, browser, context);
    }
