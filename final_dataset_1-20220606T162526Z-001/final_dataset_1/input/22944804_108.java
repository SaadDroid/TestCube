public Element signXMLUsingKeyPass(Document doc,
                                       String certAlias,
                                       String encryptedKeyPass,
                                       String algorithm,
                                       String idAttrName,
                                       String id,
                                       boolean includeCert,
                                       String xpath)  throws XMLSignatureException {

        return sp.signXMLUsingKeyPass(doc, certAlias, encryptedKeyPass, algorithm, idAttrName, id, includeCert, xpath);
    }
