public Conditions get(SAML2Config saml2Config, Date issueInstant,
                          SAML2SubjectConfirmation saml2SubjectConfirmation) throws TokenCreationException {
        Conditions conditions = AssertionFactory.getInstance().createConditions();
        try {
            conditions.setNotBefore(issueInstant);
            conditions.setNotOnOrAfter(new Date(issueInstant.getTime() + (saml2Config.getTokenLifetimeInSeconds() * 1000)));
        } catch (SAML2Exception e) {
            throw new TokenCreationException(ResourceException.INTERNAL_ERROR,
                    "Exception caught setting token lifetime state in SAML2TokenGenerationImpl: " + e, e);

        }
        String audience = saml2Config.getSpEntityId();
        /*
         Section 4.1.4.2 of http://docs.oasis-open.org/security/saml/v2.0/saml-profiles-2.0-os.pdf specifies that
         Audiences specifying the entity ids of SPs, must be contained in the AudienceRestriction for bearer tokens.
         */
        if (((audience == null) || audience.isEmpty()) && SAML2SubjectConfirmation.BEARER.equals(saml2SubjectConfirmation)) {
            throw new TokenCreationException(ResourceException.BAD_REQUEST, "The audiences field in the SAML2Config is empty, " +
                    "but the BEARER SubjectConfirmation is required. BEARER tokens must include Conditions with " +
                    "AudienceRestrictions specifying the SP entity ids.");
        }
        if ((audience != null) && !audience.isEmpty()) {
            try {
                AudienceRestriction audienceRestriction = AssertionFactory.getInstance().createAudienceRestriction();
                List<String> audienceList = new ArrayList<String>(1);
                audienceList.add(audience);
                audienceRestriction.setAudience(audienceList);
                List<AudienceRestriction> audienceRestrictionList = new ArrayList<AudienceRestriction>(1);
                audienceRestrictionList.add(audienceRestriction);
                conditions.setAudienceRestrictions(audienceRestrictionList);
            } catch (SAML2Exception e) {
                throw new TokenCreationException(ResourceException.INTERNAL_ERROR,
                        "Exception caught setting audience restriction state in SAML2TokenGenerationImpl: " + e, e);
            }

        }
        return conditions;
    }
