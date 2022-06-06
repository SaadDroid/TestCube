public SwaggerParseResult readContents(String swaggerAsString, List<AuthorizationValue> auth, ParseOptions options) {
        SwaggerParseResult output = null;

        for(SwaggerParserExtension extension : OpenAPIV3Parser.getExtensions()) {
            output = extension.readContents(swaggerAsString, auth, options);
            if(output != null && output.getOpenAPI() != null) {
                return output;
            }
        }

        return output;
    }
