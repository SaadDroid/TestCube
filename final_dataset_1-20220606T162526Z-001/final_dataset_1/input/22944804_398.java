@Override
    public Promise<ActionResponse, ResourceException> actionCollection(Context context, ActionRequest request) {
        if ("validate".equals(request.getAction())) {
            try {
                JsonValue json = request.getContent();
                SupportedScriptingLanguage language = getLanguageFromString(json.get(SCRIPT_LANGUAGE).asString());
                String script = json.get(SCRIPT_TEXT).asString();
                if (script == null) {
                    throw new ScriptException(MISSING_SCRIPT);
                }

                List<ScriptError> scriptErrorList = scriptValidator.validateScript(new ScriptObject(EMPTY,
                        decodeScript(script), language, null));
                if (scriptErrorList.isEmpty()) {
                    return newResultPromise(newActionResponse(json(object(field("success", true)))));
                }

                Set<Object> errors = new HashSet<>();
                for (ScriptError error : scriptErrorList) {
                    errors.add(object(
                            field("line", error.getLineNumber()),
                            field("column", error.getColumnNumber()),
                            field("message", error.getMessage())));
                }
                return newResultPromise(newActionResponse(json(object(field("success", false), field("errors", errors)))));
            } catch (ScriptException se) {
                return exceptionMappingHandler.handleError(context, request, se).asPromise();
            }
        } else {
            return new NotSupportedException().asPromise();
        }
    }
