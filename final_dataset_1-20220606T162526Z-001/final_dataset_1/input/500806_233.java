@Override
    protected void execute(SeleniumBrowser browser, TestContext context) {
        Alert alert = browser.getWebDriver().switchTo().alert();
        if (alert == null) {
            throw new CitrusRuntimeException("Failed to access alert dialog - not found");
        }

        if (StringUtils.hasText(text)) {
            log.info("Validating alert text");

            String alertText = context.replaceDynamicContentInString(text);

            if (ValidationMatcherUtils.isValidationMatcherExpression(alertText)) {
                ValidationMatcherUtils.resolveValidationMatcher("alertText", alert.getText(), alertText, context);
            } else {
                Assert.isTrue(alertText.equals(alert.getText()),
                        String.format("Failed to validate alert dialog text, " +
                                "expected '%s', but was '%s'", alertText, alert.getText()));

            }
            log.info("Alert text validation successful - All values Ok");
        }

        context.setVariable(SeleniumHeaders.SELENIUM_ALERT_TEXT, alert.getText());

        if (accept) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }
