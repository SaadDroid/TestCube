@Override
    protected void execute(SeleniumBrowser browser, TestContext context) {
        if (!allowAlreadyStarted && browser.isStarted()) {
            log.warn("There are some open web browsers. They will be stopped.");
            browser.stop();
        } else if (browser.isStarted()) {
            log.info("Browser already started - skip start action");
            context.setVariable(SeleniumHeaders.SELENIUM_BROWSER, browser.getName());
            return;
        }

        log.info("Opening browser of type {}", browser.getEndpointConfiguration().getBrowserType());
        browser.start();

        if (StringUtils.hasText(getBrowser().getEndpointConfiguration().getStartPageUrl())) {
            NavigateAction openStartPage = new NavigateAction.Builder()
                    .page(getBrowser().getEndpointConfiguration().getStartPageUrl())
                    .build();
            openStartPage.execute(browser, context);
        }

        context.setVariable(SeleniumHeaders.SELENIUM_BROWSER, browser.getName());
    }
