public static Calendar  isoTocal(String isoStr) throws ConverterException {
        Calendar out;
        Matcher tzMatcher;
        String tzStr;
        ZoneOffset dtZone;
        if(isoStr == null){
            throw new ConverterException(new NullPointerException());
        }
        try {
            tzMatcher = tzPattern.matcher(isoStr);
            if(tzMatcher.find()) {
                tzStr = String.format("%s%s",tzMatcher.group(1),tzMatcher.group(2));
                dtZone = ZoneOffset.of(tzStr);
                // Work around for bug: https://bugs.java.com/bugdatabase/view_bug.do?bug_id=JDK-8032051
                // Formatter isn't working as I'd hope for our case either:
                // https://stackoverflow.com/questions/43360852/cannot-parse-string-in-iso-8601-format-lacking-colon-in-offset-to-java-8-date
                // timezone pattern matched ZoneOffset converts our timezone to the proper format
                //isoStr = isoStr.replaceAll(String.format("\\%s", tzStr), dtZone.toString());
                //replaceAll will replace all matches, ex: in 2018-08-08T00:00:00-08 only last one should be replaced.
                isoStr = StringUtils.removeEnd(isoStr,tzStr);
                isoStr = isoStr + dtZone.toString();
                //minimum accepted by Java 8 is: "2018-12-10T08:45-01:30" but need to handle only hours too like "2018-12-10T08-01:30"
                //as this was accepted before Java 8.
                if(isoStr.length() == 19){//like "2018-12-10T08-01:30" insert ':00' after the hours
                    StringBuffer buffer = new StringBuffer(isoStr);
                    buffer.insert(isoStr.lastIndexOf('-'),defaultMinutes);
                    isoStr = buffer.toString();
                }
            }else{
                // tzPattern didn't match, meaning offset or T pattern not found. If no time pattern found
                // append a default time and default to UTC offset
                if (!isoStr.contains("T")) {
                    isoStr = String.format("%sT%s", isoStr, defaultTime);
                } else {//T or Thh case need to be handled as these were accepted before Java 8.
                    if (isoStr.endsWith("T")){
                        isoStr = String.format("%s%s", isoStr, defaultTime);
                    } else { //after T there are only 2 digits then append ':00' for the minutes
                        if(Pattern.matches(".*T[0-9]{2}$", isoStr)){
                            isoStr = isoStr + defaultMinutes;
                        }
                    }
                }
                dtZone = ZoneOffset.UTC;
            }

            OffsetDateTime dateTime =  OffsetDateTime.of(LocalDateTime.parse(isoStr, DateTimeFormatter.ISO_DATE_TIME),dtZone);
            out = GregorianCalendar.from(ZonedDateTime.from(dateTime));
        } catch (Exception ex) {
            throw new ConverterException(ex);
        }
        return out;
    }
