public Document parse(URLConnection uc, Element instruction,
			PrintWriter logger) throws SSLProtocolException {
		if (null == uc) {
			throw new NullPointerException(
					"Unable to parse resource: URLConnection is null.");
		}
		jlogger.fine("Received URLConnection object for " + uc.getURL());
		Document doc = null;
		try (InputStream inStream = URLConnectionUtils.getInputStream(uc)) {
			doc = parse(inStream, instruction, logger);
		} catch (SSLProtocolException sslep){
			throw new SSLProtocolException("[SSL ERROR] Failed to connect with the requested URL due to \"Invalid server_name\" found!! :" + uc.getURL() +":" + sslep.getClass() +" : "+ sslep.getMessage());
		} catch (Exception e) {
			throw new RuntimeException(
					String.format("Failed to parse resource from %s", uc.getURL()),
					e);
		}
		return doc;
	}
