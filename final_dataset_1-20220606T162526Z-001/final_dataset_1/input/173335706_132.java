@Override
    public Result<Map<String, String>> authenticate(String username, String password, String extra) {
        Result<Map<String, String>> result = new Result<>();
        // verify username and password
        User user = userService.queryUser(username, password);
        if (user == null) {
            result.setCode(Status.USER_NAME_PASSWD_ERROR.getCode());
            result.setMsg(Status.USER_NAME_PASSWD_ERROR.getMsg());
            return result;
        }

        // check user state
        if (user.getState() == Flag.NO.ordinal()) {
            result.setCode(Status.USER_DISABLED.getCode());
            result.setMsg(Status.USER_DISABLED.getMsg());
            return result;
        }

        // create session
        String sessionId = sessionService.createSession(user, extra);
        if (sessionId == null) {
            result.setCode(Status.LOGIN_SESSION_FAILED.getCode());
            result.setMsg(Status.LOGIN_SESSION_FAILED.getMsg());
            return result;
        }
        logger.info("sessionId : {}" , sessionId);
        result.setData(Collections.singletonMap(Constants.SESSION_ID, sessionId));
        result.setCode(Status.SUCCESS.getCode());
        result.setMsg(Status.LOGIN_SUCCESS.getMsg());
        return result;
    }
