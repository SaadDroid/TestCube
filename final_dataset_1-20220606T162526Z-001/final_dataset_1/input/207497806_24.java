@RequestMapping(method = RequestMethod.PATCH, value = "/{" + NGSIConstants.QUERY_PARAMETER_ID + "}")
	public ResponseEntity<byte[]> updateSubscription(HttpServletRequest request,
			@PathVariable(name = NGSIConstants.QUERY_PARAMETER_ID, required = true) URI id,
			@RequestBody String payload) {
		logger.trace("call updateSubscription() ::");

		try {
			HttpUtils.doPreflightCheck(request, payload);
			List<Object> context = HttpUtils.getAtContext(request);
			String resolved = contextResolver.expand(payload, context, true, AppConstants.SUBSCRIPTIONS_URL_ID);
			Subscription subscription = DataSerializer.getSubscription(resolved);
			if (subscription.getId() == null) {
				subscription.setId(id);
			}
			SubscriptionRequest subscriptionRequest = new SubscriptionRequest(subscription, context);

			// expandSubscriptionAttributes(subscription, context);
			if (resolved == null || subscription == null || !id.equals(subscription.getId())) {
				return badRequestResponse;
			}
			manager.updateSubscription(subscriptionRequest);
		} catch (ResponseException e) {
			logger.error("Exception ::", e);
			return ResponseEntity.status(e.getHttpStatus()).body(new RestResponse(e).toJsonBytes());
		}
		return ResponseEntity.noContent().build();
	}
