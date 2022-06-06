static List<SearchQuery.AbstractAttributeQuery> parseAttributeStringQuery(String attributeQuery) {
        List<SearchQuery.AbstractAttributeQuery> pAttributes = new ArrayList<>();
        String[] attributesString = attributeQuery.split(ATTRIBUTES_DELIMITER_REGEX);

        for (String attributeString : attributesString) {

            int firstColon = attributeString.indexOf(ATTRIBUTES_SPLITTER);
            String attributeType = attributeString.substring(0, firstColon);
            attributeString = attributeString.substring(firstColon + 1);


            Matcher matcher = Pattern.compile(ATTRIBUTES_SPLITTER_REGEX).matcher(attributeString);

            if (matcher.find()) {
                int secondColon = matcher.start();

                String attributeName = attributeString.substring(0, secondColon);
                String attributeValue = attributeString.substring(secondColon + 1);

                switch (attributeType) {
                    case "BOOLEAN":
                        SearchQuery.BooleanAttributeQuery baq = new SearchQuery.BooleanAttributeQuery(attributeName, Boolean.valueOf(attributeValue));
                        pAttributes.add(baq);
                        break;
                    case "DATE":
                        SearchQuery.DateAttributeQuery daq = new SearchQuery.DateAttributeQuery();
                        daq.setName(attributeName);
                        try {
                            daq.setDate(DateUtils.parse(attributeValue));
                            pAttributes.add(daq);
                        } catch (ParseException e) {
                            LOGGER.log(Level.FINEST, null, e);
                        }
                        break;
                    case "TEXT":
                        SearchQuery.TextAttributeQuery taq = new SearchQuery.TextAttributeQuery(attributeName, attributeValue);
                        pAttributes.add(taq);
                        break;
                    case "NUMBER":
                        try {
                            SearchQuery.NumberAttributeQuery naq = new SearchQuery.NumberAttributeQuery(attributeName, NumberFormat.getInstance().parse(attributeValue).floatValue());
                            pAttributes.add(naq);
                        } catch (ParseException e) {
                            LOGGER.log(Level.INFO, null, e);
                        }
                        break;
                    case "URL":
                        SearchQuery.URLAttributeQuery uaq = new SearchQuery.URLAttributeQuery(attributeName, attributeValue);
                        pAttributes.add(uaq);
                        break;

                    case "LOV":
                        SearchQuery.LovAttributeQuery laq = new SearchQuery.LovAttributeQuery(attributeName, attributeValue);
                        pAttributes.add(laq);
                        break;

                    default:
                        break;
                }

            } else {
                throw new IllegalStateException("Can't parse attribute: " + attributeQuery);
            }
        }
            return pAttributes;
    }
