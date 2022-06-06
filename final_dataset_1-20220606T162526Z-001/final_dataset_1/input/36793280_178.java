public static <T> CheckedFunction0<T> recover(CheckedFunction0<T> function,
        CheckedFunction1<Throwable, T> exceptionHandler) {
        return () -> {
            try {
                return function.apply();
            } catch (Throwable throwable) {
                return exceptionHandler.apply(throwable);
            }
        };
    }
