@Override
	public void run() {
		ApplicationContext ctx = ApplicationContext.getInstance();
		LOGGER.debug("Starting resolution process on {}...",new Date());
		try(WriteSession session=ctx.createSession()) {
			ResourceSnapshot snapshot=
				session.find(
					ResourceSnapshot.class,
					this.name,
					DynamicResourceHandler.class);

			DataSet dataSet = this.handler.get(snapshot);
			Individual<?,?> individual =
				dataSet.
					individualOfId(ManagedIndividualId.createId(snapshot.name(),snapshot.templateId()));

			SnapshotResolver snapshotResolver =
				SnapshotResolver.
					builder().
						withReadSession(session).
						withCanonicalBase(CANONICAL_BASE).
						build();
			URI snapshotEndpoint = snapshotResolver.toURI(snapshot);

			individual.
				addValue(
					SNAPSHOT_ENDPOINT,
					Literals.newLiteral(snapshotEndpoint));
			individual.
				addValue(
					SNAPSHOT_RESOLUTION,
					Literals.newLiteral(roundtrip(snapshotResolver,snapshotEndpoint,snapshot)));

			this.handler.update(this.name, dataSet);

			session.modify(snapshot);
			session.saveChanges();
		} catch (Exception e) {
			LOGGER.error("Could not resolve resource",e);
		} finally {
			LOGGER.debug("Finalized resolution process");
		}
	}
