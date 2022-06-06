@Override
    public Properties process(Properties in) {
        Properties out = new Properties();
        for (Entry<Object, Object> entry : in.entrySet()) {
            Matcher wordMatcher = Pattern.compile(PropertiesKeywords.GENERATE_WORD_REGEX.getKey()).matcher(entry.getValue().toString());
            Matcher numberMatcher = Pattern.compile(PropertiesKeywords.GENERATE_NUMBER_REGEX.getKey()).matcher(entry.getValue().toString());
            Matcher dateMatcher = Pattern.compile(PropertiesKeywords.GENERATE_DATE_REGEX.getKey()).matcher(entry.getValue().toString());
            String tmp = entry.getValue().toString();

            while (wordMatcher.find()) {
                String toReplace = wordMatcher.group();
                Matcher tmpMatcher = Pattern.compile("\\d+").matcher(toReplace);
                tmpMatcher.find();
                String length = tmpMatcher.group();
                tmp = tmp.replace(toReplace, GenerationUtil.generateWord(Integer.parseInt(length)));
            }

            while (numberMatcher.find()) {
                String toReplace = numberMatcher.group();
                Matcher tmpMatcher = Pattern.compile("\\d+").matcher(toReplace);
                tmpMatcher.find();
                String length = tmpMatcher.group();
                tmp = tmp.replace(toReplace, GenerationUtil.generateNumber(Integer.parseInt(length)));
            }

            while (dateMatcher.find()) {
                String toReplace = dateMatcher.group();
                // getting offset
                Matcher offsetMatcher = Pattern.compile("-{0,1}\\d+").matcher(toReplace);
                offsetMatcher.find();
                String offset = offsetMatcher.group();
                // getting format
                Matcher formatMatcher = Pattern.compile("(?<=generate_date\\().*?(?=;)").matcher(toReplace);
                formatMatcher.find();
                String format = formatMatcher.group();
                // generating date
                tmp = tmp.replace(toReplace,
                        GenerationUtil.generateTime(format, Integer.parseInt(offset), Calendar.DAY_OF_YEAR));
            }

            out.put(entry.getKey(), tmp);
        }
        return out;
    }
