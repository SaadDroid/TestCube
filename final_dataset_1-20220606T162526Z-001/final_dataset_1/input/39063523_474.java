public List<ServiceDispensation> buildInitialServiceDispensations(PTVProgramStockInformation ptvProgramStockInformation) throws LMISException {
        List<ServiceDispensation> serviceDispensations = new ArrayList<>();
        for (HealthFacilityService healthFacilityService : getAllHealthFacilityServices()) {
            ServiceDispensation serviceDispensation = new ServiceDispensation();
            serviceDispensation.setHealthFacilityService(healthFacilityService);
            serviceDispensation.setPtvProgramStockInformation(ptvProgramStockInformation);
            serviceDispensations.add(serviceDispensation);
        }

        return serviceDispensations;
    }
