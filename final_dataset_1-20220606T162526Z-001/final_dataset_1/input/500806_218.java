@Override
    protected void execute(WebElement webElement, SeleniumBrowser browser, TestContext context) {
        WebDriverWait q = new WebDriverWait(browser.getWebDriver(), Math.round(timeout / 1000.0D));

        if (condition.equals("hidden")) {
            q.until(ExpectedConditions.invisibilityOf(webElement));
        } else if (condition.equals("visible")) {
            q.until(ExpectedConditions.visibilityOf(webElement));
        } else {
            throw new CitrusRuntimeException("Unknown wait condition");
        }
    }
