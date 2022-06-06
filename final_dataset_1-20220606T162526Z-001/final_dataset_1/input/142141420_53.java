@RequestMapping(value="/flag/reject/{id:.+}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Response> rejectFlag(@PathVariable(value = "id") String contentId){
		String apiId = "ekstep.learning.content.rejectFlag";
		TelemetryManager.log("Reject flagged content | Content Id : " + contentId);
		Response response;
		try {
			response = contentManager.rejectFlag(contentId);
			return getResponseEntity(response, apiId, null);
		} catch(Exception e) {
			TelemetryManager.error("Exception occured while Rejecting Flagged Content: " + e.getMessage(), e);
			return getExceptionResponseEntity(e, apiId, null);
		}
	}
