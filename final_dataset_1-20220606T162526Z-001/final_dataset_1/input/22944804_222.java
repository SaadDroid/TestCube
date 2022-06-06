@Override
    public Promise<Response, NeverThrowsException> filter(Context context, Request request, Handler next) {
        try {
            return next.handle(evaluate(context, request), request);
        } catch (BadRequestException e ) {
            return newResultPromise(new Response(Status.BAD_REQUEST).setEntity(e.toJsonValue().getObject()));
        } catch (ResourceException e) {
            return newResultPromise(new Response(Status.INTERNAL_SERVER_ERROR).setEntity(e.toJsonValue().getObject()));
        }
    }
