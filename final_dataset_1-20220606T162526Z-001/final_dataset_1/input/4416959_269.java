@SuppressWarnings({"rawtypes", "unchecked"})
    public void handleRequestException(Throwable exception) throws IOException
    {
        // skip handling of known exceptions if there are none configured
        if (configuration.isEmpty())
        {
            renderException(exception);
            return;
        }

        Throwable cause = exception;

        // Depending on where the error was thrown, there could be several levels of wrappers..
        // For exceptions in component operations, it's OperationException -> ComponentEventException -> <Target>Exception

        // Throw away the wrapped exceptions first
        while (cause instanceof TapestryException)
        {
            if (cause.getCause() == null) break;
            cause = cause.getCause();
        }

        Class<?> causeClass = cause.getClass();
        if (!configuration.containsKey(causeClass))
        {
            // try at most two level of superclasses before delegating back to the default exception handler
            causeClass = causeClass.getSuperclass();
            if (causeClass == null || !configuration.containsKey(causeClass))
            {
                causeClass = causeClass.getSuperclass();
                if (causeClass == null || !configuration.containsKey(causeClass))
                {
                    renderException(exception);
                    return;
                }
            }
        }

        Object[] exceptionContext = formExceptionContext(cause);
        Object value = configuration.get(causeClass);
        Object page = null;
        ExceptionHandlerAssistant assistant = null;
        if (value instanceof ExceptionHandlerAssistant)
        {
            assistant = (ExceptionHandlerAssistant) value;
            // in case the assistant changes the context
            List context = Arrays.asList(exceptionContext);
            page = assistant.handleRequestException(exception, context);
            exceptionContext = context.toArray();
        } else if (!(value instanceof Class))
        {
            renderException(exception);
            return;
        } else page = value;

        if (page == null) return;

        try
        {
            if (page instanceof Class)
                page = componentClassResolver.resolvePageClassNameToPageName(((Class) page).getName());

            Link link = page instanceof Link
                    ? (Link) page
                    : linkSource.createPageRenderLink(page.toString(), false, exceptionContext);

            if (request.isXHR())
            {
                OutputStream os = response.getOutputStream("application/json;charset=UTF-8");

                JSONObject reply = new JSONObject();
                reply.in(InternalConstants.PARTIAL_KEY).put("redirectURL", link.toRedirectURI());

                os.write(reply.toCompactString().getBytes("UTF-8"));

                os.close();

                return;
            }

            // Normal behavior is just a redirect.

            response.sendRedirect(link);
        }
        // The above could throw an exception if we are already on a render request, but it's
        // user's responsibility not to abuse the mechanism
        catch (Exception e)
        {
            logger.warn("A new exception was thrown while trying to handle an instance of {}.",
                    exception.getClass().getName(), e);
            // Nothing to do but delegate
            renderException(exception);
        }
    }
