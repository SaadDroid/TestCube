@RequestMapping(CONFIG_RELOAD_PATH)
    public void reloadConfig(final HttpServletResponse response) throws Exception {
        for(final ReloadableCustomizationComponent component : reloadableCustomizationComponents) {
            log.info("Reloading customization component: " + component.getClass().getSimpleName());
            component.reload();
        }

        // Prevents a situation where we could have two adjacent slashes in a URL contcatenated
        // from the server context path and the APP_PATH
        final List<String> pathElements = Stream.of(
            (contextPath + FindController.APP_PATH).split("/")
        ).filter(s -> !s.isEmpty()).collect(Collectors.toList());

        final String redirect = "/" + String.join("/", pathElements);
        response.sendRedirect(redirect);
    }
