public SocketClient getConnectionWithRetries(String ip, int port, int retries, long retrySleep) throws Exception {
		SocketClient client = new SocketClient();
		RetryOnException retryHandler = new RetryOnException(retries, retrySleep);

		while (true) {
			try {
				client.startConnection(ip, port);
			} catch (Exception ex) {
				log.error("error", ex);
				retryHandler.exceptionOccurred();
			}
		}
	}
