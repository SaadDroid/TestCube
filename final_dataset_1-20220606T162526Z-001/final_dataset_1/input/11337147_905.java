protected final void outputException(final Throwable e, final HttpServletRequest req, final HttpServletResponse resp, final int httpStatusCode) {

        if (httpStatusCode >= 0) {
            resp.setStatus(httpStatusCode);
        }
        resp.setContentType("application/json;charset=UTF-8");

        try {
            final PrintWriter output = resp.getWriter();
            if(e instanceof APIException) {
                setLocalization((APIException) e, LocaleUtils.getUserLocaleAsString(req));
            }

            output.print(e == null ? "" : JSonSerializer.serialize(e));
            output.flush();
        } catch (final Exception e2) {
            throw new APIException(e2);
        }
    }
