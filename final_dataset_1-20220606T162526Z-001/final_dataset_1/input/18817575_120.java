@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String suffix = substringAfter(req.getRequestURI(), req.getServletPath() + "/" + getLabel());
        if (!isBlank(suffix) && suffix.startsWith(STATISTICS_API_PATH)) {
            setNoCacheHeaders(res);
            getModelMetadata(suffix.substring(STATISTICS_API_PATH.length()), res);
            return;
        }
        if (!isBlank(suffix) && suffix.startsWith(RESET_API_PATH)) {
            setNoCacheHeaders(res);
            resetStatistics(res);
            return;
        }
        super.doGet(req, res);
    }
