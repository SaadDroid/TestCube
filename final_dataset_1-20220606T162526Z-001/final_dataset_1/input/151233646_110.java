boolean isRetry() {

        //
        // Max retries exceeded.
        //
        if (count > writeOptions.getMaxRetries()) {

            LOG.log(Level.WARNING, "Max write retries exceeded.", throwable);

            return false;
        }

        if (throwable instanceof HttpException) {

            HttpException he = (HttpException) throwable;

            //
            // Retry HTTP error codes >= 429
            //
            return he.code() >= ABLE_TO_RETRY_ERROR;
        }

        if (throwable instanceof IOException) {
            // Much of the code here is inspired
            // by that in okhttp3.internal.http.RetryAndFollowUpInterceptor.

            if (throwable instanceof ProtocolException) {
                return false;
            }

            if (throwable instanceof InterruptedIOException) {
                return throwable instanceof SocketTimeoutException;
            }

            if (throwable instanceof SSLHandshakeException) {
                if (throwable.getCause() instanceof CertificateException) {
                    return false;
                }
            }
            if (throwable instanceof SSLPeerUnverifiedException) {
                // e.g. a certificate pinning error.
                return false;
            }

            return true;
        }

        return false;
    }
