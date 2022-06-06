public static FeignException getException(HttpStatus httpStatus, String message) {
        return FeignException.errorStatus(message, error(httpStatus));
    }
