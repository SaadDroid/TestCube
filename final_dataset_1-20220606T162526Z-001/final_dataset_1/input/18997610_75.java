public void processResponse(ApiResponse response) {

        if (response.get$ref() != null){
            processReferenceResponse(response);
        }

        Schema schema = null;
        if(response.getContent() != null){
            Map<String,MediaType> content = response.getContent();
            for( String mediaName : content.keySet()) {
                MediaType mediaType = content.get(mediaName);
                if(mediaType.getSchema()!= null) {
                    schema = mediaType.getSchema();
                    if (schema != null) {
                        schemaProcessor.processSchema(schema);
                    }
                }
                if(mediaType.getExamples() != null) {
                    for(Example ex: mediaType.getExamples().values()){
                        exampleProcessor.processExample(ex);
                    }
                }
            }
        }
        if (response.getHeaders() != null){
            Map<String,Header> headers = response.getHeaders();
            for(String headerName : headers.keySet()){
                Header header = headers.get(headerName);
                headerProcessor.processHeader(header);
            }


        }
        if (response.getLinks() != null){
            Map<String,Link> links = response.getLinks();
            for(String linkName : links.keySet()){
                Link link = links.get(linkName);
                linkProcessor.processLink(link);
            }
        }
    }
