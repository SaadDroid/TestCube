@Override
    public void translateFields() {
        List<Field> fields = getQueryRequest().getRequestedFields();
        for (Iterator<Field> i = fields.iterator(); i.hasNext(); ) {
            Field field = i.next();
            translateField(field);
        }
        translatedRequestedFields = fields;
    }
