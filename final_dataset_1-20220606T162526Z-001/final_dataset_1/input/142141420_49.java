@SuppressWarnings("unchecked")
//	@RequestMapping(value = "/update/{id:.+}", method = RequestMethod.PATCH)
//	@ResponseBody
	public ResponseEntity<Response> update(@PathVariable(value = "id") String contentId,
			@RequestBody Map<String, Object> requestMap) {
		String apiId = "ekstep.learning.content.update";
		TelemetryManager.log(
				"Executing Content Update API (Java Version) (API Version V3) For Content Id: " + contentId + ".",
				requestMap);
		Request request = getRequest(requestMap);
		try {
			Map<String, Object> map = (Map<String, Object>) request.get("content");
			Response response = contentManager.update(contentId, map);
			return getResponseEntity(response, apiId, null);
		} catch (Exception e) {
			TelemetryManager.error("Exception: " + e.getMessage(), e);
			return getExceptionResponseEntity(e, apiId, null);
		}
	}
