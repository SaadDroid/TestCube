@RequestMapping(value = "/review/{id:.+}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Response> review(@PathVariable(value = "id") String contentId,
			@RequestBody Map<String, Object> map) {
		String apiId = "ekstep.learning.content.review";
		Response response;
		TelemetryManager.log("Review content | Content Id : " + contentId);
		try {
			TelemetryManager
					.log("Calling the Manager for 'Review' Operation | [Content Id " + contentId + "]" + contentId);
			Request request = getRequest(map);
			response = contentManager.review(contentId, request);
			return getResponseEntity(response, apiId, null);
		} catch (Exception e) {
			TelemetryManager.error("Exception: " + e.getMessage(), e);
			return getExceptionResponseEntity(e, apiId, null);
		}
	}
