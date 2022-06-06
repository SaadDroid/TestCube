public VmManagerClient getVMMClient(int id) {
		
		List<Provider> providers = getProviders();
		
		if(providers.size() >= 1) {
			if(id == -1) {
				return new VmManagerClientBSSC(providers.get(0).getVmmUrl());
			} else {
				for(Provider provider : providers) {
					if(id == provider.getId()) {
						return new VmManagerClientBSSC(provider.getVmmUrl());
					}
				}
			}
		}
		
		return null;
	}
