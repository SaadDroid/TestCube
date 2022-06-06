public TDecision findDecisionByRef(TDRGElement parent, String href) {
        TDRGElement drgElement = findDRGElementByRef(parent, href);
        if (drgElement instanceof TDecision) {
            return (TDecision) drgElement;
        } else {
            throw new DMNRuntimeException(String.format("Cannot find Decision element for href='%s'", href));
        }
    }
