@DELETE
	@Path("{image_id}")
	public Response deleteCacheImage(@PathParam("application_name") String applicationName, @PathParam("image_id") String imageId) {
		logger.info("GET request to paht: /applications/" + applicationName + "/cache-images/" + imageId);
		
		int id = 0;
		
		try {
			id = Integer.parseInt(imageId);
		} catch(NumberFormatException ex) {
			return buildResponse(Status.BAD_REQUEST, "Id: " + imageId + " is not a valid image id!!!");
		}
		
		Image image = imageDAO.getById(id);
		
		if(image == null) {
			return buildResponse(Status.NOT_FOUND, "No image with id: " + id + " found in the DB!");
		} else if(!image.isDemo()) {
			return buildResponse(Status.BAD_REQUEST, "Image with ID: " + id + " is not a cache Image, not possible to delete it.");
		}
		
		List<VM> vms = vmDAO.getNotDeletedVMsWithImage(image);
		
		if(vms.size() != 0) {
			return buildResponse(Status.CONFLICT, "Image with ID: " + image.getId() + " is still being used by one or more VMs.");
		}
		if(image.getProviderId() == null || image.getProviderId() == "") {
			image.setProviderId("-1");
		}
		
		try {
			VmManagerClient vmManagerClient = prClient.getVMMClient(Integer.parseInt(image.getProviderId()));
			
			if(vmManagerClient == null) {
				return buildResponse(Status.INTERNAL_SERVER_ERROR, "No provider with ID: " + image.getProviderId());
			}
		
			vmManagerClient.deleteImage(image.getProviderImageId()); 
			image.setDemo(false);
			imageDAO.update(image);

			return buildResponse(Status.NO_CONTENT, "");
		} catch(NumberFormatException ex) {
			return buildResponse(Status.INTERNAL_SERVER_ERROR, "Wrong provider ID stored in the DB");
		}
	}
