@SuppressWarnings("unchecked")
	@RequestMapping(value = "/hierarchy/update", method = RequestMethod.PATCH)
	@ResponseBody
	public ResponseEntity<Response> updateHierarchy(@RequestBody Map<String, Object> requestMap) {
		String apiId = "content.hierarchy.update";
		Request request = getRequest(requestMap);
		try {
			Map<String, Object> map = (Map<String, Object>) request.get("data");
			Response response = contentManager.updateHierarchy(map);
			return getResponseEntity(response, apiId, null);
		} catch (Exception e) {
			TelemetryManager.error("Exception: " + e.getMessage(), e);
			return getExceptionResponseEntity(e, apiId, null);
		}
	}
