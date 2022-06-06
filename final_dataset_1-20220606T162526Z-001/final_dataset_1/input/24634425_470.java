@DELETE
	@Path("{vm_id}")
	public Response deleteVM(@PathParam("application_name") String applicationName, @PathParam("deployment_id") String deploymentId, @PathParam("vm_id") String vmId) {
		
		int deploymentIdInt = 0;
		// I need to get the OVF definition
		try {
			deploymentIdInt = Integer.parseInt(deploymentId);
		} catch(NumberFormatException ex) {
			return buildResponse(Status.BAD_REQUEST, "Invalid deploymentID number!!!");
		}
		
		Deployment deployment = deploymentDAO.getById(deploymentIdInt);
		
		if(deployment == null) {
			return buildResponse(Status.BAD_REQUEST, "No deployment by that ID in the DB!!!");
		}
		
		if(!deployment.getStatus().equals(APPLICATION_STATUS_DEPLOYED)) {
			return buildResponse(Status.BAD_REQUEST, "No Active deployment!!!");
		}
		
		int vmIdInt = 0;
		try {
			vmIdInt = Integer.parseInt(vmId);
		} catch(NumberFormatException ex) {
			return buildResponse(Status.BAD_REQUEST, "Invalid vmId number!!!");
		}
		
		VM vm = vmDAO.getById(vmIdInt);
		
		if(vm == null) {
			return buildResponse(Status.BAD_REQUEST, "No VM by that Id in the database!!!");
		}
		
		// Now we determine if we are inside the limtis to create a new VM
		VMLimits vmLimits = OVFUtils.getUpperAndLowerVMlimits(OVFUtils.getVirtualSystemForOvfId(deployment.getOvf(), vm.getOvfId()));
		List<VM> vms = vmDAO.getVMsWithOVfIdForDeploymentNotDeleted(vm.getOvfId(), deploymentIdInt);
		
		if(vms.size() <= vmLimits.getLowerNumberOfVMs()) {
			return buildResponse(Status.BAD_REQUEST, vm.getOvfId() + " number of VMs already at its minimum!!!");
		}
		
		logger.info("DELETING VM: " + vm.getProviderVmId());
		
		vmManagerClient.deleteVM(vm.getProviderVmId());
			
		vm.setStatus(STATE_VM_DELETED);
		
		vmDAO.update(vm);
		
		getEnergyModeller().writeDeploymentRequest(vm.getProviderId(), 
				                                   applicationName, 
				                                   "" + deployment.getId(), 
				                                   "" + vm.getId(), 
				                                   vm.getProviderVmId(), 
				                                   vm.getStatus());
		
		AmqpProducer.sendVMDeletedMessage(applicationName, deployment, vm);
		
		return buildResponse(Status.NO_CONTENT, "");
	}
