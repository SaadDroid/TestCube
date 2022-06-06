@VisibleForTesting
    void process(final HttpServletRequest request, final HttpServletResponse response, final PrintWriter out,
                 final String reqBinding) throws FederatedSSOException, IOException, SessionException {
        if (cookieRedirector.needSetLBCookieAndRedirect(request, response, true)) {
            return;
        }

        final IDPRequestValidator validator =
                saml2ActorFactory.getIDPRequestValidator(reqBinding, isFromECP);

        //IDP Proxy with introduction cookie case.
        //After reading the introduction cookie, it redirects to here.
        String requestID = request.getParameter("requestID");

        if (idpProxyCase(requestID, request, response)) {
            return;
        }

        // Fetch a number of properties about the request.
        String idpMetaAlias = validator.getMetaAlias(request);
        String realm = validator.getRealmByMetaAlias(idpMetaAlias);
        String idpEntityID = validator.getIDPEntity(idpMetaAlias, realm);
        SAML2IdentityProviderAdapter idpAdapter = validator.getIDPAdapter(realm, idpEntityID);
        String reqID = request.getParameter(REQ_ID);
        if (null != auditor && StringUtils.isNotEmpty(reqID)) {
            auditor.setRequestId(reqID);
        }
        IDPSSOFederateRequest reqData = new IDPSSOFederateRequest(reqID, realm, idpAdapter, idpMetaAlias, idpEntityID);
        reqData.setEventAuditor(auditor);
        // get the request id query parameter from the request. If this
        // is the first visit then the request id is not set; if it is
        // coming back from a successful authentication, then request
        // id should be there.
        if (StringUtils.isEmpty(reqData.getRequestID())) {
            SAMLAuthenticator samlAuthenticator = saml2ActorFactory.getSAMLAuthenticator(reqData, request, response,
                    out, isFromECP);
            samlAuthenticator.authenticate();
        } else {
            SAMLAuthenticatorLookup samlLookup = saml2ActorFactory.getSAMLAuthenticatorLookup(reqData, request,
                    response, out);
            samlLookup.retrieveAuthenticationFromCache();
        }
    }
