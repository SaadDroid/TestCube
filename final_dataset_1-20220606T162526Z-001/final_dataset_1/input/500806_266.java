@Override
    protected void execute(SeleniumBrowser browser, TestContext context) {
        try {
            if (browser.getWebDriver() instanceof JavascriptExecutor) {
                JavascriptExecutor jsEngine = ((JavascriptExecutor) browser.getWebDriver());
                jsEngine.executeScript(context.replaceDynamicContentInString(script), context.resolveDynamicValuesInArray(arguments.toArray()));

                List<String> errors = new ArrayList<>();
                List<Object> errorObjects = (List<Object>) jsEngine.executeScript("return window._selenide_jsErrors", new Object[]{});
                if (errorObjects != null) {
                    for (Object error : errorObjects) {
                        errors.add(error.toString());
                    }
                }

                context.setVariable(SeleniumHeaders.SELENIUM_JS_ERRORS, errors);

                for (String expected : expectedErrors) {
                    if (!errors.contains(expected)) {
                        throw new ValidationException("Missing JavaScript error " + expected);
                    }
                }
            } else {
                log.warn("Skip javascript action because web driver is missing javascript features");
            }
        } catch (WebDriverException e) {
            throw new CitrusRuntimeException("Failed to execute JavaScript code", e);
        }
    }
