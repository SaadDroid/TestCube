@Override
    public Object resolveArgument(MethodParameter parameter,
                                 ModelAndViewContainer container,
                                 NativeWebRequest webRequest,
                                 WebDataBinderFactory binderFactory) throws Exception {

        final Object nativeRequest = webRequest.getNativeRequest();

        if (!(nativeRequest instanceof SlingHttpServletRequest)) {
            throw new IllegalStateException("Expected a " + SlingHttpServletRequest.class.getName() +
                                            " request, but got: " + nativeRequest + ".");
        }

        final SlingHttpServletRequest request = (SlingHttpServletRequest) nativeRequest;
        final ResourceParam resourceParam = getParameterAnnotation(parameter);
        final String parameterName = resolveParameterName(parameter, resourceParam);
        final boolean required = resourceParam.required() && isEmpty(resourceParam.defaultValue());
        final String resourcePath = resolveResourcePath(request, resourceParam, parameterName, required);

        if (resourcePath == null) {
            return null;
        }

        // We must resolve (and not use getResource()) as the resource path may be mapped.
        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.resolve(request, resourcePath);

        if (isNonExistingResource(resource)) {
            if (required) {
                throw new UnresolvableResourceException("Unable to resolve resource " + resourcePath +
                                                        " for the required parameter '" + parameterName + "'.");
            }
            return null;
        }

        if (parameter.getParameterType().isAssignableFrom(Resource.class)) {
            return resource;
        }

        Object adapted = resource.adaptTo(parameter.getParameterType());
        if (adapted == null && required) {
                throw new MissingAdapterException("Unable to adapt " + resource + " to " + parameter.getParameterType() +
                                                  " for required parameter '" + parameterName + "'.");
        }

        return adapted;
    }
