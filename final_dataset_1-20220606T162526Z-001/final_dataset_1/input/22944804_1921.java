public Subject get(String subjectId, String spAcsUrl, SAML2Config saml2Config,
                       SAML2SubjectConfirmation subjectConfirmation,
                       Date assertionIssueInstant, ProofTokenState proofTokenState) throws TokenCreationException {
        try {
            Subject subject = AssertionFactory.getInstance().createSubject();
            setNameIdentifier(subject, subjectId, saml2Config.getNameIdFormat());
            SubjectConfirmation subConfirmation =
                    AssertionFactory.getInstance().createSubjectConfirmation();
            switch (subjectConfirmation) {
                case BEARER:
                    subConfirmation.setMethod(SAML2Constants.SUBJECT_CONFIRMATION_METHOD_BEARER);
                     /*
                    see section 4.1.4.2 of http://docs.oasis-open.org/security/saml/v2.0/saml-profiles-2.0-os.pdf -
                    Recipient attribute of SubjectConfirmation element must be set to the Service Provider
                    ACS url.
                     */
                    SubjectConfirmationData bearerConfirmationData =
                            AssertionFactory.getInstance().createSubjectConfirmationData();
                    bearerConfirmationData.setRecipient(spAcsUrl);
                    /*
                    see section 4.1.4.2 of http://docs.oasis-open.org/security/saml/v2.0/saml-profiles-2.0-os.pdf - NotBefore cannot
                    be set, but NotOnOrAfter must be set.
                     */
                    bearerConfirmationData.setNotOnOrAfter(new Date(assertionIssueInstant.getTime() +
                            (saml2Config.getTokenLifetimeInSeconds() * 1000)));
                    subConfirmation.setSubjectConfirmationData(bearerConfirmationData);
                    break;
                case SENDER_VOUCHES:
                    subConfirmation.setMethod(SAML2Constants.SUBJECT_CONFIRMATION_METHOD_SENDER_VOUCHES);
                    break;
                case HOLDER_OF_KEY:
                    subConfirmation.setMethod(SAML2Constants.SUBJECT_CONFIRMATION_METHOD_HOLDER_OF_KEY);
                    subConfirmation.setSubjectConfirmationData(getHoKSubjectConfirmationData(proofTokenState.getX509Certificate()));
                    break;
                default:
                    throw new TokenCreationException(ResourceException.INTERNAL_ERROR,
                            "Unexpected SubjectConfirmation value in DefaultSubjectProvider: " + subjectConfirmation);

            }
            List<SubjectConfirmation> subjectConfirmationList = new ArrayList<>();
            subjectConfirmationList.add(subConfirmation);
            subject.setSubjectConfirmation(subjectConfirmationList);
            return subject;
        } catch (SAML2Exception e) {
            throw new TokenCreationException(ResourceException.INTERNAL_ERROR,
                    "Exception caught setting subject confirmation state in DefaultSubjectProvider: " + e, e);
        }
    }
