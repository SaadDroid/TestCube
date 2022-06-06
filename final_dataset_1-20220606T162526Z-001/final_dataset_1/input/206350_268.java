@Override
	public DbAdapter createAdapter(DataNodeDescriptor nodeDescriptor, final DataSource dataSource) {

		String adapterType = null;

		if (nodeDescriptor != null) {
			adapterType = nodeDescriptor.getAdapterType();
		}

		// must not create AutoAdapter via objectFactory, so treat explicit
		// AutoAdapter as null and let it fall through to the default. (explicit
		// AutoAdapter is often passed from the cdbimport pligin).
		if (adapterType != null && adapterType.equals(AutoAdapter.class.getName())) {
			adapterType = null;
		}

		if (adapterType != null) {
			DbAdapter dbAdapter = objectFactory.newInstance(DbAdapter.class, adapterType);
			return setupPkGenerator(dbAdapter);
		} else {
			return new AutoAdapter(() -> detectAdapter(dataSource), jdbcEventLogger);
		}
	}
