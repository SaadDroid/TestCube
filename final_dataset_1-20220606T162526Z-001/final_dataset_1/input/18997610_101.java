public SwaggerParseResult readLocation(String url, List<AuthorizationValue> auth, ParseOptions options) {
        SwaggerParseResult output = null;

        for(SwaggerParserExtension extension : OpenAPIV3Parser.getExtensions()) {
            output = extension.readLocation(url, auth, options);
            if(output != null && output.getOpenAPI() != null) {
                return output;
            }
        }

        return output;
    }
