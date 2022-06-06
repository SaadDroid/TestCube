public synchronized static StringTemplateGroup getBasicProcessesGroup() {
        try {
            if (BASIC_ST_GROUP == null) {
                initialization();
            }
            return BASIC_ST_GROUP;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
