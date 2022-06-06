@ResponseBody
    public ResponseEntity<byte[]> exportQueryResults(
            @RequestParam(QUERY_REQUEST_PARAM) final String queryRequestJSON,
            // required = false to prevent Spring errors if the user asks for a CSV with no fields marked for exportQueryResults.
            // The UI should not allow the User to send a request for a CSV with nothing in it.
            @RequestParam(value = SELECTED_EXPORT_FIELDS_PARAM, required = false) final Collection<String> selectedFieldNames
    ) throws IOException, E {
        final R queryRequest = requestMapper.parseQueryRequest(queryRequestJSON);
        return writeDataToOutputStream(outputStream -> export(outputStream, queryRequest, selectedFieldNames), QUERY_RESULT_EXPORT_FILE_NAME);
    }
