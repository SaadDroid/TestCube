@Override
    protected void findServiceOfferingId() {
        serviceOfferingId = vpcOffDao.findById(vpc.getVpcOfferingId()).getServiceOfferingId();
        if (serviceOfferingId == null) {
            findDefaultServiceOfferingId();
        }
    }
