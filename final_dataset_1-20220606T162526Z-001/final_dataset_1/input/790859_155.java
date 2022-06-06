public static WSDLService fromWSDL(final String wsdlLocationURI) throws WSDLReaderException {
        int index = wsdlLocationURI.indexOf("#");
        if (index > 0) {
            String wsdlLocation = wsdlLocationURI.substring(0, index);
            String localPart = wsdlLocationURI.substring(index + 1);
            String portName = null;
            if (localPart.contains(PORTTYPE)) {
                portName = localPart.substring(PORTTYPE.length() + 1, localPart.length() - 1);
            } else {
                throw WSDLExtensionsMessages.MESSAGES.invalidWSDLInterfacePart(wsdlLocationURI);
            }
            return fromWSDL(wsdlLocation, portName);
        } else {
            throw WSDLExtensionsMessages.MESSAGES.invalidWSDLInterface(wsdlLocationURI);
        }
    }
