public static ThrowsJavadoc parseTag( String owningClass, String value ) {
        if ( value == null || value.trim().length() == 0 ) {
            return null;
        }

        String[] exceptionClassAndComment = whitespace.split(value.trim(), 2);
        String exceptionClass = toFullClassName(owningClass, exceptionClassAndComment[0]);
        String comment = exceptionClassAndComment.length == 1 ? "" :exceptionClassAndComment[1];

        return new ThrowsJavadoc( exceptionClass, CommentParser.parse(owningClass,comment) );
    }
