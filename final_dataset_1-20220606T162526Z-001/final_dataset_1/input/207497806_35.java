@PatchMapping("/{entityId}/attrs/{attrId}")
	public ResponseEntity<byte[]> partialUpdateEntity(HttpServletRequest request,
			@PathVariable("entityId") String entityId, @PathVariable("attrId") String attrId,
			@RequestBody String payload) {
		try {
			HttpUtils.doPreflightCheck(request, payload);
			logger.trace("partial-update entity :: started");
			String expandedPayload = httpUtils.expandPayload(request, payload, AppConstants.ENTITIES_URL_ID);

			String expandedAttrib = paramsResolver.expandAttribute(attrId, payload, request);

			UpdateResult update = entityService.partialUpdateEntity(entityId, expandedAttrib, expandedPayload);
			logger.trace("partial-update entity :: completed");
			if (update.getStatus()) {
				return ResponseEntity.noContent().build();
			} else {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
			/*
			 * There is no 207 multi status response in the Partial Attribute Update
			 * operation. Section 6.7.3.1 else { return
			 * ResponseEntity.status(HttpStatus.MULTI_STATUS).body(update.
			 * getAppendedJsonFields()); }
			 */
		} catch (ResponseException responseException) {
			logger.error("Exception :: ", responseException);
			return ResponseEntity.status(responseException.getHttpStatus()).body(new RestResponse(responseException).toJsonBytes());
		} catch(DateTimeParseException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new RestResponse(ErrorType.BadRequestData, "Failed to parse provided datetime field.").toJsonBytes());
		} catch(JsonParseException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new RestResponse(ErrorType.BadRequestData, "There is an error in the provided json document").toJsonBytes());
		} catch (Exception exception) {
			logger.error("Exception :: ", exception);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new RestResponse(ErrorType.InternalError, exception.getLocalizedMessage()).toJsonBytes());
		}
	}
