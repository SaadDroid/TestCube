@Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        response.setDateHeader("Last-Modified", System.currentTimeMillis());
        response.setCharacterEncoding("UTF-8");
        String queryString = request.getParameter("query");
        if (queryString == null) {
            response.sendError(400, "No query given");
            return;
        }

        String normalized = queryString.toLowerCase(Locale.ENGLISH).replaceAll("\\s+", " ");
        if (!normalized.startsWith("ask") && !normalized.contains(" ask ")) {
            String limit = request.getParameter("limit");
            String offset = request.getParameter("offset");
            if (maxLimit != null) {
                if (limit != null) {
                    limit = String.valueOf(Math.min(Integer.valueOf(limit), maxLimit));
                } else {
                    limit = maxLimit.toString();
                }
            }

            if (limit != null) {
                queryString += "\nLIMIT " + limit;
            }
            if (offset != null) {
                queryString += "\nOFFSET " + offset;
            }
        }

        try {
            handleRequest(request, response, queryString);
        } catch (Exception e) {
            if (e.getMessage() != null) {
                logger.error(e.getMessage(), e);
                response.sendError(400, e.getMessage() + "\n\n" + request.getParameter("query")); // NOSONAR
            } else {
                logger.error("Caught Exception", e);
                response.sendError(400);
            }

        }
    }
