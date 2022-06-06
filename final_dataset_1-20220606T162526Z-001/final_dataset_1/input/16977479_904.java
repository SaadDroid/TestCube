public DomainExpression build(Element element) {
        loadDynamic();
        DomainExpressionBuilder builder;

        QName qname = new QName(element.getNamespaceURI(), element.getLocalName());
        builder = get(qname);

        if (null == builder) {
            throw new PolicyException(new Message("NO_DOMAINEXPRESSIONBUILDER_EXC",
                                                  BUNDLE, qname.toString()));
        }

        return builder.build(element);

    }
