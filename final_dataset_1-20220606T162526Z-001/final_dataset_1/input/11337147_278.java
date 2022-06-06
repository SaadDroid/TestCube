public APISession getApiSession() {
        final HttpSession httpSession = request.getSession();
        return (APISession) httpSession.getAttribute(ATTRIBUTE_API_SESSION);

    }
