@Override
    protected void describeMismatchSafely(Response response, Description mismatchDescription) {
        List<Header> headers = response.getHeaders();
        
        if (headers.isEmpty()) {
            mismatchDescription.appendText("Response has no headers");
        } else {
            mismatchDescription.appendText("Response has headers [" + StringUtils.join(response.getHeaders(), ", ") + "]");
        }
    }
