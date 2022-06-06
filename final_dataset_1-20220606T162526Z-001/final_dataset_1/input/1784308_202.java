public static void assertAccessibility(WebDriver webDriver, Testable testable) {
        assertThat(webDriver, is(compliantTo(testable)));
    }
