@Override
    public DistributedAppliance validateForUpdate(DistributedApplianceDto dto) throws Exception {
        BaseDtoValidator.checkForNullId(dto);

        DistributedAppliance da = this.em.find(DistributedAppliance.class, dto.getId());

        if (da == null) {

            throw new VmidcBrokerValidationException("Distributed Appliance entry with name: "
                    + dto.getName() + ") is not found.");
        }

        ValidateUtil.checkMarkedForDeletion(da, da.getName());

        if (!dto.getMcId().equals(da.getApplianceManagerConnector().getId())) {

            throw new VmidcBrokerValidationException("Appliance Manager Connector change is not allowed.");
        }

        validate(dto, false, da);

        return da;
    }
