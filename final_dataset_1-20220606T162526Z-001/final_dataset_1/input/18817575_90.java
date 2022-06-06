@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String suffix = substringAfter(req.getRequestURI(), req.getServletPath() + "/" + getLabel());

        if (!isBlank(suffix) && suffix.startsWith("/tail")) {
            this.tailServlet.service(req, res);
            return;
        }

        if ("/download".equals(suffix)) {
            download(res, req);
            return;
        }

        if ("/serverTime".equals(suffix)) {
            serverTime(res);
            return;
        }

        super.doGet(req, res);
    }
