public static int parse(SessionDescription out, String[] lines, int offset) throws ParseException {
        Matcher m = tParsePattern.matcher(lines[offset]);
        if (!m.find())
            throw new ParseException("not a valid time record", offset);
        
        TimeDescription td;
        try {
            td = new TimeDescription(Long.parseLong(m.group(1)), Long.parseLong(m.group(2)));
            out.getTimes().add(td);
            if (++offset == lines.length)
                return 1;
            m = rParsePattern.matcher(lines[offset]);
            if (m.matches()) {
                td.setPeriodic(true);
                m = numberParsePattern.matcher(lines[offset]);
                m.find();
                td.setRepeatInterval(Long.parseLong(m.group()));
                m.find();
                td.setActiveDuration(Long.parseLong(m.group()));
                while (m.find())
                    td.getOffsets().add(Long.parseLong(m.group()));
            } else
                return 1;
        } catch (Exception ex) {
            throw (ParseException) new ParseException("not a valid time record", offset).initCause(ex);
        }
        
        return 2;
    }
