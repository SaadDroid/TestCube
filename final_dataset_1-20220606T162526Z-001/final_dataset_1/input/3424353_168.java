public void generateAgencyNarratives(NarrativeProviderImpl provider) {

    for (Agency agency : _gtfsDao.getAllAgencies()) {

      AgencyNarrative.Builder narrative = AgencyNarrative.builder();
      narrative.setLang(deduplicate(agency.getLang()));
      narrative.setName(deduplicate(agency.getName()));
      narrative.setPhone(deduplicate(agency.getPhone()));
      narrative.setEmail(deduplicate(agency.getEmail()));
      narrative.setTimezone(deduplicate(agency.getTimezone()));
      narrative.setUrl(deduplicate(agency.getUrl()));
      narrative.setEmail(agency.getEmail());
      narrative.setFareUrl(agency.getFareUrl());

      String disclaimer = _modifications.getModificationForTypeAndId(
          AgencyNarrative.class, agency.getId(), "disclaimer");
      if (disclaimer != null)
        narrative.setDisclaimer(disclaimer);

      Boolean privateService = _modifications.getModificationForTypeAndId(
          AgencyNarrative.class, agency.getId(), "privatService");
      if (privateService != null)
        narrative.setPrivateService(privateService);

      provider.setNarrativeForAgency(agency.getId(), narrative.create());
    }
  }
