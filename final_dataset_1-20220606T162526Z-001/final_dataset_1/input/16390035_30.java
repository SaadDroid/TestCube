public static ContentLengthField parse(String fieldValue) throws ParseException {
        long length;
        
        try {
            length = Long.parseLong(fieldValue);
        } catch (Exception ex) {
            throw (ParseException) new ParseException("not a valid content-length field", 0).initCause(ex);
        }
        
        return new ContentLengthField(length);
    }
