@Override
	public Outcome handleRequest(Exchange exc) throws Exception {

		logMappings();

		ListIterator<String>  it = exc.getDestinations().listIterator();
		while ( it.hasNext() ) {
			String dest = it.next();

			String pathQuery = URLUtil.getPathQuery(router.getUriFactory(), dest);
			int pathBegin = -1;
			int authorityBegin = dest.indexOf("//");
			if (authorityBegin != -1)
				pathBegin = dest.indexOf("/", authorityBegin + 2);
			String schemaHostPort = pathBegin == -1 ? null : dest.substring(0, pathBegin);

			log.debug("pathQuery: " + pathQuery);
			log.debug("schemaHostPort: " + schemaHostPort);

			Mapping mapping = findFirstMatchingRegEx(pathQuery);
			if (mapping == null)
				continue;

			Type do_ = mapping.getDo();

			log.debug("match found: " + mapping.from);
			log.debug("replacing with: " + mapping.to);
			log.debug("for type: " + do_);

			String newDest = replace(pathQuery, mapping);

			if (do_ == Type.REDIRECT_PERMANENT || do_ == Type.REDIRECT_TEMPORARY) {
				exc.setResponse(Response.redirect(newDest, do_ == Type.REDIRECT_PERMANENT).build());
				return Outcome.RETURN;
			}

			if (!newDest.contains("://") && schemaHostPort != null) {
				// prepend schema, host and port from original uri
				newDest = schemaHostPort + newDest;
			}

			it.set(newDest);
		}

		Mapping mapping = findFirstMatchingRegEx(exc.getRequest().getUri());
		if (mapping != null && mapping.do_ == Type.REWRITE) {
			String newDest = replace(exc.getRequest().getUri(), mapping);
			if (newDest.contains("://")) {
				newDest = URLUtil.getPathQuery(router.getUriFactory(), newDest);
			}
			exc.getRequest().setUri(newDest);
		}

		return Outcome.CONTINUE;
	}
