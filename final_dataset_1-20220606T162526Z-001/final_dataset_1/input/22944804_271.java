public boolean handleRequest(final HttpServletRequest req, final HttpServletResponse res) {
        if (req.getHeader(CORSConstants.ORIGIN) == null) {
            return true;
        }

        if (!isValidCORSRequest(req)) {
            return false;
        }

        if (isPreflightFlow(req)) {
            handlePreflightFlow(req, res);
            return false;
        } else {
            handleActualRequestFlow(req, res);
            return true;
        }

    }
