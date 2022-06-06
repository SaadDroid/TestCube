public static void marshall(Marshaller marshaller,
                                Object elValue,
                                MessagePartInfo part,
                                Object source) {
        try {
            // The Marshaller.JAXB_FRAGMENT will tell the Marshaller not to
            // generate the xml declaration.
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
        } catch (javax.xml.bind.PropertyException e) {
            // intentionally empty.
        }

        Class<?> cls = null;
        if (part != null) {
            cls = part.getTypeClass();
        }

        if (cls == null) {
            cls = null != elValue ? elValue.getClass() : null;
        }

        if (cls != null && cls.isArray() && elValue instanceof Collection) {
            Collection<?> col = (Collection<?>)elValue;
            elValue = col.toArray((Object[])Array.newInstance(cls.getComponentType(), col.size()));
        }

        try {
            Object mObj = elValue;
            QName elName = null;
            if (part != null) {
                elName = part.getConcreteName();
            }

            if (null != elName) {

                if (part != null && part.getXmlSchema() instanceof XmlSchemaElement) {

                    XmlSchemaElement el = (XmlSchemaElement)part.getXmlSchema();

                    if (mObj.getClass().isArray()
                        && el.getSchemaType() instanceof XmlSchemaSimpleType
                        && ((XmlSchemaSimpleType)el.getSchemaType()).
                        getContent() instanceof XmlSchemaSimpleTypeList) {
                        mObj = Arrays.asList((Object[])mObj);
                        writeObject(marshaller, source, newJAXBElement(elName, cls, mObj));
                    } else if (part.getMessageInfo().getOperation().isUnwrapped()
                               && (mObj.getClass().isArray() || mObj instanceof List)
                               && el.getMaxOccurs() != 1) {
                        writeArrayObject(marshaller,
                                         source,
                                         elName,
                                         mObj);
                    } else {
                        writeObject(marshaller, source, newJAXBElement(elName, cls, mObj));
                    }
                } else if (byte[].class == cls && part.getTypeQName() != null
                           && "hexBinary".equals(part.getTypeQName().getLocalPart())) {
                    mObj = new HexBinaryAdapter().marshal((byte[])mObj);
                    writeObject(marshaller, source, newJAXBElement(elName, String.class, mObj));
                } else if (mObj instanceof JAXBElement) {
                    writeObject(marshaller, source, mObj);
                } else if (marshaller.getSchema() != null) {
                    //force xsi:type so types can be validated instead of trying to
                    //use the RPC/lit element names that aren't in the schema
                    writeObject(marshaller, source, newJAXBElement(elName, Object.class, mObj));
                } else {
                    writeObject(marshaller, source, newJAXBElement(elName, cls, mObj));
                }
            } else {
                writeObject(marshaller, source, mObj);
            }
        } catch (Fault ex) {
            throw ex;
        } catch (javax.xml.bind.MarshalException ex) {
            Message faultMessage = new Message("MARSHAL_ERROR", LOG, ex.getLinkedException()
                .getMessage());
            throw new Fault(faultMessage, ex);
        } catch (Exception ex) {
            throw new Fault(new Message("MARSHAL_ERROR", LOG, ex.getMessage()), ex);
        }
    }
