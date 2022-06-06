private void confirmRegistration(Client client, User user, io.gravitee.am.identityprovider.api.User principal, Handler<AsyncResult<RegistrationResponse>> handler) {
        userService.confirmRegistration(client, user, principal)
                .subscribe(
                        response -> handler.handle(Future.succeededFuture(response)),
                        error -> handler.handle(Future.failedFuture(error)));
    }
