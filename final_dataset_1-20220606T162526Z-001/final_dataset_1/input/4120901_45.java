public ConfigurableApplicationContext createApplicationContext() {
		logger.info("resource is:" + resource);
		if (resource == null) {
			return parent;
		}
		try {
			logger.info("create application context, resource:" + resource.getFile().getAbsolutePath()
					+ ", classloader:" + this.beanClassLoader + ". Parent is:" + parent);
			FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext();
			context.setClassLoader(this.beanClassLoader);
			context.setParent(parent);
			context.setConfigLocation(HadoopWorkflowUtils.fileURLPrefix + resource.getFile().getAbsolutePath());
			context.refresh();
			return context;
		} catch (Exception e) {
			try {
				logger.error("create application context fail. with resource:" + resource.getFile().getAbsolutePath(),
						e);
			} catch (IOException e1) {
				logger.error("log error", e1);
			}
		}
		return parent;
	}
