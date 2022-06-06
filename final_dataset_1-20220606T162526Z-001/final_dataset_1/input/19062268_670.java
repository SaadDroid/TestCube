File temporalDirectory() {
		if(this.temporalDirectory==null) {
			String ctx=this.contextPath.substring(1);
			File result=null;
			for(TemporalDirectoryFactory factory:FACTORIES) {
				result=factory.create(ctx);
				if(result!=null) {
					break;
				}
			}
			if(result==null) {
				result=Files.createTempDir();
			}
			this.temporalDirectory=result;
		}
		return this.temporalDirectory;

	}
