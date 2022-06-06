protected Map<String, List<String>> providerIdsAndItsVMIds(Deployment deployment) {
		Map<String, List<String>> providerVMIds = new HashMap<String, List<String>>();
		
		for(VM vm : deployment.getVms()) {
			String id = vm.getProviderId();
			
			if(id == null || id == "") {
				id="-1";
			}
			
			List<String> ids = providerVMIds.get(id);
			
			if(ids == null) {
				ids = new ArrayList<String>();
				providerVMIds.put(id, ids);
			}
			
			ids.add(vm.getProviderVmId());
		}
		
		return providerVMIds;
	}
