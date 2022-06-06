public static String getAttributeValue(X500Principal principal, String attributeName) {
        try {
            LdapName ldapName = new LdapName(principal.getName(X500Principal.RFC2253, OID_MAP));
            for (Rdn rdn : ldapName.getRdns()) {
                Attributes attrs = rdn.toAttributes();
                NamingEnumeration<? extends Attribute> values = attrs.getAll();
                while (values.hasMoreElements()) {
                    Attribute attr = values.next();
                    if (attributeName.equalsIgnoreCase(attr.getID())) {
                        return attr.get() == null ? null : attr.get().toString();
                    }
                }
            }
        } catch (NamingException ne) {
            DEBUG.warning("A naming error occurred while trying to retrieve " + attributeName + " from principal: "
                    + principal, ne);
        }
        return null;
    }
