@ExceptionHandler(Exception.class)
    public Result exceptionHandler(Exception e, HandlerMethod hm) {
        ApiException ce = hm.getMethodAnnotation(ApiException.class);
        if (ce == null) {
            logger.error(e.getMessage(), e);
            return Result.errorWithArgs(Status.INTERNAL_SERVER_ERROR_ARGS, e.getMessage());
        }
        Status st = ce.value();
        logger.error(st.getMsg(), e);
        return Result.error(st);
    }
