@Override
    public Promise<ActionResponse, ResourceException> actionCollection(Context serverContext,
            ActionRequest actionRequest) {

        if (!actionRequest.getAction().equals(BATCH)) {
            final String msg = "Action '" + actionRequest.getAction() + "' not implemented for this resource";
            final NotSupportedException exception = new NotSupportedException(msg);
            debug.error(msg, exception);
            return exception.asPromise();
        }

        String scriptId = null;

        try {
            JsonValue scriptIdValue = actionRequest.getContent().get(SCRIPT_ID);

            if (scriptIdValue == null) {
                if (debug.errorEnabled()) {
                    debug.error("BatchResource :: actionCollection - ScriptId null. Default scripts not implemented.");
                }
                return new BadRequestException().asPromise();
            } else {
                scriptId = scriptIdValue.asString();
            }

            final JsonValue requests = actionRequest.getContent().get(REQUESTS);

            final String realm = getRealm(serverContext);
            final ScriptConfiguration scriptConfig =
                    scriptingServiceFactory.create(SubjectUtils.createSuperAdminSubject(), realm).get(scriptId);
            final ScriptObject script = new ScriptObject(scriptConfig.getName(), scriptConfig.getScript(),
                    scriptConfig.getLanguage());
            final ScriptResponse response = new ScriptResponse();

            final Bindings bindings = new SimpleBindings();
            bindings.put(PAYLOAD, requests);
            bindings.put(CONTEXT, serverContext);
            bindings.put(LOGGER, debug);
            bindings.put(REQUESTER, requester);
            bindings.put(RESPONSE, response);

            return newResultPromise(newActionResponse((JsonValue) scriptEvaluator.evaluateScript(script, bindings)));

        } catch (ScriptException e) {
            debug.error("BatchResource :: actionCollection - Error running script : {}", scriptId);
            return exceptionMappingHandler.handleError(serverContext, actionRequest, e).asPromise();
        } catch (javax.script.ScriptException e) {
            debug.error("BatchResource :: actionCollection - Error running script : {}", scriptId);
            return new InternalServerErrorException().asPromise();
        }
    }
