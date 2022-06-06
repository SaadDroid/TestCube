@PatchMapping("/{entityId}/attrs/{attrId}/{instanceId}")
	public ResponseEntity<byte[]> modifyAttribInstanceTemporalEntity(HttpServletRequest request,
			@PathVariable("entityId") String entityId, @PathVariable("attrId") String attrId,
			@PathVariable("instanceId") String instanceId, @RequestBody(required = false) String payload) {
		try {
			logger.trace("modifyAttribInstanceTemporalEntity :: started");
			logger.debug("entityId : " + entityId + " attrId : " + attrId + " instanceId : " + instanceId);

			String resolved = httpUtils.expandPayload(request, payload, AppConstants.HISTORY_URL_ID);

			// TODO : TBD- conflict between specs and implementation <mentioned no request
			// body in specs>
			historyService.modifyAttribInstanceTemporalEntity(entityId, resolved, attrId, instanceId,
					HttpUtils.parseLinkHeader(request, NGSIConstants.HEADER_REL_LDCONTEXT));
			logger.trace("modifyAttribInstanceTemporalEntity :: completed");
			return ResponseEntity.noContent().build();
		} catch (ResponseException ex) {
			logger.error("Exception", ex);
			return ResponseEntity.status(ex.getHttpStatus()).body(new RestResponse(ex).toJsonBytes());
		} catch (Exception ex) {
			logger.error("Exception", ex);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new RestResponse(ErrorType.InternalError, ex.getLocalizedMessage()).toJsonBytes());
		}
	}
