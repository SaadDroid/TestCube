@RequestMapping("/user/myinfo")
    public Callable<String> myinfo(final HttpServletRequest request, final Principal principal) {

        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                request.setAttribute("member", memberManager.findByPrimaryKey(getPrincipalId(principal)));
                return "index";
            }
        };
    }
