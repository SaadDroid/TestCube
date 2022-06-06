public String createAndSendMailForDeplyoments(
			final List<DeploymentEntity> deployments) {
		String message = null;

		// do nothing if no deployment is available
		if (deployments != null && !deployments.isEmpty()) {
			String subjectMessage = "AMW-Deploy for tracking id: "
					+ deployments.get(0).getTrackingId();

			try {
				Address[] emailReceipients = getAllReceipients(deployments);

				if (notificationService.createAndSendMail(subjectMessage,
						getMessageContentForDeployments(deployments),
						emailReceipients)) {
					message = getSuccessfulSendMailToReceipientMessage(emailReceipients);
				}
			} catch (MessagingException e) {
				message = getFailureSendMailMessage(e.getMessage());
				log.log(Level.WARNING, "Deployment notification ("
						+ subjectMessage + ") could not be sent", e);
			}
		}

		return message;
	}
