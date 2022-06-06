public boolean evaluateSelectorForTransfer(final FlowSpec flowSpec,
			final TransferAttempt transferAttempt) {

		log.info("match on action...");
		if (flowSpec.getSelector().getFlowActionEnum() == FlowActionEnum.ANY) {
			// matches
		} else if (flowSpec.getSelector().getFlowActionEnum() == FlowActionEnum.GET
				&& transferAttempt.getTransfer().getTransferType() == TransferType.GET) {
			// matches
		} else if (flowSpec.getSelector().getFlowActionEnum() == FlowActionEnum.PUT
				&& transferAttempt.getTransfer().getTransferType() == TransferType.PUT) {
			// matches
		} else {

			return false;
		}

		log.info("passes action...check host...");

		boolean passes = compareSelectorToTransferValueAsStringWithWildcard(
				flowSpec.getSelector().getHostSelector(), transferAttempt
						.getTransfer().getGridAccount().getHost());

		if (!passes) {
			log.info("fails host match");
			return false;
		}

		log.info("passes action...check host...");

		passes = compareSelectorToTransferValueAsStringWithWildcard(flowSpec
				.getSelector().getZoneSelector(), transferAttempt.getTransfer()
				.getGridAccount().getZone());

		if (!passes) {
			log.info("fails zone match");
			return false;
		}

		log.info("matched!");
		return true;

	}
