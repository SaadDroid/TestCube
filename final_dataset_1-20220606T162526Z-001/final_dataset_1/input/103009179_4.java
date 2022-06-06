@Override
    public boolean canHandle(final HttpServletRequest request, final HttpServletResponse response) {
        final String openIdMode = request.getParameter(OpenIdConstants.OPENID_MODE);
        if (StringUtils.equals(openIdMode, OpenIdConstants.ASSOCIATE)) {
            logger.info("Handling request. openid.mode : {}", openIdMode);
            return true;
        }
        logger.info("Cannot handle request. openid.mode : {}", openIdMode);
        return false;
    }
