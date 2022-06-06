@Selector(value="topic.deployment.status", reactor="@rootReactor")
	public void deployDeployment(Event<DeploymentEvent> event) {

		DeploymentEvent deploymentEvent = event.getData();
		
		if(deploymentEvent.getDeploymentStatus().equals(Dictionary.APPLICATION_STATUS_CONTEXTUALIZED)) {

			// We need to know the provider information first... 
			VmManagerClient vmManagerClient = prClient.getVMMClient(deploymentEvent.getProviderId());

			// We need first to read the deployment from the DB:
			Deployment deployment = deploymentDAO.getById(deploymentEvent.getDeploymentId());
			
			if(vmManagerClient != null) {
				logger.info("Creating a new thread to deploy in infrastructure the deployment: " + deploymentEvent.getDeploymentId());
				logger.info("Connecting to the VMM: " + vmManagerClient.getURL());

				// First we change the status of the deployment proccess... 
				deployment.setStatus(Dictionary.APPLICATION_STATUS_DEPLOYING);
				deploymentDAO.update(deployment);

				// We sent the message that the deploying state starts:
				AmqpProducer.sendDeploymentDeployingMessage(deploymentEvent.getApplicationName(), deployment);

				try {
					OvfDefinition ovfDocument = OVFUtils.getOvfDefinition(deployment.getOvf());
					String applicationName = OVFUtils.getApplicationName(deployment.getOvf());
					VirtualSystemCollection vsc = ovfDocument.getVirtualSystemCollection();

					// We check all the Virtual Systems in the OVF file
					for(int i = 0; i < vsc.getVirtualSystemArray().length; i++) {
						VirtualSystem virtualSystem = vsc.getVirtualSystemAtIndex(i);
						String ovfID = virtualSystem.getId();

						logger.info(" Starting to deploy Virtual System: " + virtualSystem.getName());

						VirtualHardwareSection virtualHardwareSection = virtualSystem.getVirtualHardwareSection();

						// We find the disk id for each resource... 
						String diskId = OVFUtils.getDiskId(virtualHardwareSection);

						// We find the file id and for each resource // ovfId
						String fileId = OVFUtils.getFileId(diskId, ovfDocument.getDiskSection().getDiskArray());

						// We get the images urls... // ovfHref 
						String urlImg = OVFUtils.getUrlImg(ovfDocument, fileId);

						Image image = null;

						if(OVFUtils.usesACacheImage(virtualSystem)) {
							logger.info("This virtual system uses a cache demo image");
							image = imageDAO.getDemoCacheImage(fileId, urlImg);
							if(image == null) {
								logger.info("The image was not cached, we need to uplaod first");
								image = ImageUploader.uploadImage(urlImg, fileId, true, applicationName, vmManagerClient, applicationDAO, imageDAO);
							}
						} else {
							image = ImageUploader.uploadImage(urlImg, fileId, false, applicationName, vmManagerClient, applicationDAO, imageDAO);
						}

						//Now we have the image... lets see what it is the rest to build the VM to Upload...
						String ovfVirtualSystemID = virtualSystem.getId();
						// We determine how many VMs of this type we need to create
						VMLimits vmLimits = OVFUtils.getUpperAndLowerVMlimits(virtualSystem);
						long minNumberVMs = vmLimits.getLowerNumberOfVMs();
						long maxNumberVMs = vmLimits.getUpperNumberOfVMs();
						int priceSchema = OVFUtils.getPriceSchema(virtualSystem.getProductSectionAtIndex(0));

						//We determine if it needs a public IP/Floating IP
						boolean publicIP = false;	
						try {
							publicIP = virtualSystem.getProductSectionAtIndex(0).isAssociatePublicIp();
						} catch(NullPointerException ex) {}

						String vmName = virtualSystem.getName();
						int cpus = virtualSystem.getVirtualHardwareSection().getNumberOfVirtualCPUs();
						int ramMb = virtualSystem.getVirtualHardwareSection().getMemorySize();
						String isoPath = OVFUtils.getIsoPathFromVm(virtualSystem.getVirtualHardwareSection(), ovfDocument);
						logger.info("ISO patth: " + isoPath);
						int capacity = OVFUtils.getCapacity(ovfDocument, diskId);

						// We force to refresh the image from the DB... 
						image = imageDAO.getById(image.getId());

						for(int j = 0; j < minNumberVMs; j++) {

							logger.info(" OVF-ID: " + ovfVirtualSystemID + " #VMs: " + minNumberVMs + " Name: " + vmName + " CPU: " + cpus + " RAM: " + ramMb + " Disk capacity: " + capacity + " ISO Path: " + isoPath + " PUBLIC IP: " + publicIP);

							int suffixInt = j + 1;
							String suffix = "_" + suffixInt;
							String iso = "";
							if(isoPath != null) iso = isoPath + suffix ;

							// TOOD I need to add here the slaagreement id. 
							Vm virtMachine = new Vm(vmName + suffix, image.getProviderImageId(), cpus, ramMb, capacity, 0, iso , ovfDocument.getVirtualSystemCollection().getId(), ovfID, ""/*deployment.getSlaAgreement()*/, publicIP );

							logger.debug("virtMachine: " + virtMachine);

							List<Vm> vms = new ArrayList<Vm>();
							vms.add(virtMachine);
							List<String> vmIds = vmManagerClient.deployVMs(vms);

							logger.debug("Id: " + vmIds.get(0));

							for(String id : vmIds) {
								VmDeployed vmDeployed = vmManagerClient.getVM(id);

								VM vmToDB = new VM();
								vmToDB.setIp(vmDeployed.getIpAddress());
								vmToDB.setOvfId(ovfVirtualSystemID);
								vmToDB.setStatus(vmDeployed.getState());
								vmToDB.setProviderVmId(id);
								// TODO I need to update this to get it from the table Agreements... 
								//vmToDB.setSlaAgreement(deployment.getSlaAgreement());
								vmToDB.setNumberVMsMax(maxNumberVMs);
								vmToDB.setNumberVMsMin(minNumberVMs);
								if(vmLimits.getMinNumberCPUs() > 0) {
									vmToDB.setCpuMin(vmLimits.getMinNumberCPUs());
								} else {
									vmToDB.setCpuMin(cpus);
								}
								vmToDB.setCpuActual(cpus);
								if(vmLimits.getMaxNumberCPUs() > 0 ) {
									vmToDB.setCpuMax(vmLimits.getMaxNumberCPUs());
								} else {
									vmToDB.setCpuMax(cpus);
								}
								vmToDB.setDiskMin(capacity);
								vmToDB.setDiskActual(capacity);
								vmToDB.setDiskMax(capacity);
								vmToDB.setRamMin(ramMb);
								vmToDB.setRamActual(ramMb);
								vmToDB.setRamMax(ramMb);
								vmToDB.setSwapMax(0);
								vmToDB.setSwapActual(0);
								vmToDB.setSwapMin(0);
								if(priceSchema != -1) {
									vmToDB.setPriceSchema(new Long(priceSchema));
								}
								vmToDB.setProviderId("" + deploymentEvent.getProviderId());
								vmDAO.save(vmToDB);

								vmToDB.addImage(image);
								vmDAO.update(vmToDB);

								deployment.addVM(vmToDB);
								deploymentDAO.update(deployment);
								//deployment = deploymentDAO.getById(deployment.getId());

								AmqpProducer.sendVMDeployedMessage(applicationName, deployment, vmToDB);
								
								//notify EM of VM deployment
//								em.notifyVMChangeInStatus("" + deploymentEvent.getProviderId(),
//										                  applicationName,
//										                  "" + deployment.getId(), 
//										                  "" + vmToDB.getId(), 
//										                  vmToDB.getProviderVmId(), 
//										                  Dictionary.APPLICATION_STATUS_DEPLOYED);
							}
						}
					}

					deployment.setStatus(Dictionary.APPLICATION_STATUS_DEPLOYED);
					
					// We initialize the application at the PriceModellerBean
					try {
						logger.info("Initializing the deployment into the PriceModeller");
						PriceModellerBean.initializeDeployment(deployment);
					} catch(NullPointerException ex) {
						logger.warn("PriceModeller object does not exist!!!");
					}
					
					// We save the changes to the DB
					deploymentDAO.update(deployment);
			} catch(OvfRuntimeException ex) {
				logger.info("Error parsing OVF file: " + ex.getMessage());
				ex.printStackTrace();
				deployment.setStatus(Dictionary.APPLICATION_STATUS_ERROR);
				// We save the changes to the DB
				deploymentDAO.update(deployment);
				AmqpProducer.sendDeploymentErrorMessage(deploymentEvent.getApplicationName(), deployment);
			} catch (Exception ex){
				logger.info("Error triying to deploy new VMs: " + ex.getMessage());
				ex.printStackTrace();
				deployment.setStatus(Dictionary.APPLICATION_STATUS_ERROR);
				// We save the changes to the DB
				deploymentDAO.update(deployment);
				AmqpProducer.sendDeploymentErrorMessage(deploymentEvent.getApplicationName(), deployment);
			}
			
			
			deploymentEvent.setDeploymentStatus(deployment.getStatus());
			
			// We sent the message that the deployed state starts:
			AmqpProducer.sendDeploymentDeployedMessage(deploymentEvent.getApplicationName(), deployment);
					
			//We notify that the deployment has been modified
			deploymentEventService.fireDeploymentEvent(deploymentEvent);
		
		
			} else {
				logger.info("Error, not available VMM Client");
				deployment.setStatus(Dictionary.APPLICATION_STATUS_ERROR);
				// We save the changes to the DB
				deploymentDAO.update(deployment);
				AmqpProducer.sendDeploymentErrorMessage(deploymentEvent.getApplicationName(), deployment);
			}
		} 
	}
