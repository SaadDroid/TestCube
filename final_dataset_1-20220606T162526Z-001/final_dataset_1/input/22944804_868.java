@Override
    public IdServicesException handleError(Context context, String debug, Request request, IdRepoException error) {
        return handleError(error);
    }
