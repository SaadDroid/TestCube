public static RtspRequestHeader parse(String[] headerLines) throws ParseException, RtspException {
        Matcher m = requestPattern.matcher(headerLines[0]);
        if (!m.find())
            throw new ParseException("not a valid request line", 0);
        if (!m.group(3).equalsIgnoreCase("RTSP"))
            throw new ParseException("unsupported protocol: " + m.group(3), 0);
        if (!m.group(4).matches("1.0"))
            throw new RtspException(505, "unsupported RTSP version: " + m.group(4), 0);
        
        RtspRequestHeader result = new RtspRequestHeader(m.group(1), m.group(2));
        
        for (int i = 1; i < headerLines.length; i++) {
            StringBuilder fieldLine = new StringBuilder(headerLines[i]);
            while (++i < headerLines.length) {
                if (headerLines[i].length() > 0 && !Character.isWhitespace(headerLines[i].charAt(0)))
                    break;
                fieldLine.append(headerLines[i].trim());
            }
            Field field = Field.parse(fieldLine.toString());
            if (field != null)
                result.addField(field);
            i--;
        }
        
        return result;
    }
