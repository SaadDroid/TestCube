@Override
	public boolean equals(Object obj) {
        if (!(obj instanceof Image))
            return false;
        if (obj == this)
            return true;

        Image image = (Image) obj;
        
        if(this.ovfId == null) {
        	if(image.getOvfId() != null) {
        		return false;
        	}
        } else if(!this.ovfId.equals(image.ovfId)) {
        	return false;
        }
        
        if(this.href == null) {
        	if(image.getHref() != null) {
        		return false;
        	}
        } else if(!this.href.equals(image.getHref())) {
        	return false;
        }
        
        if(this.providerImageId == null) {
        	if(image.getProviderImageId() != null ) {
        		return false;
        	}
        } else if(!this.providerImageId.equals(image.getProviderImageId())) {
        	return false;
        }
        
        if(this.providerId == null) {
        	if(image.getProviderId() != null) {
        		return false;
        	}
        } else if(!this.providerId.equals(image.getProviderId())) {
        	return false;
        }
        
        if(this.ovfHref == null) {
        	if(image.getOvfHref() != null) {
        		return false;
        	}
        } else if(!this.ovfHref.equals(image.getOvfHref())) {
        	return false;
        }
        
        if(this.id == image.getId()
           && this.demo == image.isDemo()) {
        	return true;
        } else {
        	return false;
        }
	}
