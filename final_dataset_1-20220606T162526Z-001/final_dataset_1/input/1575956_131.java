public static int getExceptionCode(Throwable t, int defaultCode) {
        if (t == null) {
            return BKException.Code.OK;
        } else if (t instanceof BKException) {
            return ((BKException) t).getCode();
        } else if (t.getCause() != null) {
            return getExceptionCode(t.getCause(), defaultCode);
        } else {
            return defaultCode;
        }
    }
