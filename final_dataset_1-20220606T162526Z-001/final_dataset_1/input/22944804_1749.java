public <T> T getParameter(String name) {
        Object value = getAttribute(request, name);
        if (value != null) {
            return (T) value;
        }

        //query param priority over body
        if (getQueryParameter(request, name) != null) {
            return (T) getQueryParameter(request, name);
        }

        if (request.getMethod().equals(Method.POST)) {
            if (request.getEntity() != null) {
                if (MediaType.APPLICATION_WWW_FORM.equals(request.getEntity().getMediaType())) {
                    Form form = new Form(request.getEntity());
                    // restore the entity body
                    request.setEntity(form.getWebRepresentation());
                    return (T) form.getValuesMap().get(name);
                } else if (MediaType.APPLICATION_JSON.equals(request.getEntity().getMediaType())) {
                    return (T) getBody().get(name).getObject();
                }
            }
        }
        return null;
    }
