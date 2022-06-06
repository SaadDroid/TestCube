public static boolean hasNonEmptyAttribute(HtmlElement element, String attributeName) {
        return hasAttribute(element, attributeName) && !element.getAttribute(attributeName).isEmpty();
    }
