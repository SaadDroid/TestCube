static List<String> parseHostList(String hostList) {
        Matcher rangeMatcher = Pattern.compile("([\\w-]+)\\{(\\d+)-(\\d+)}").matcher(hostList);
        if(rangeMatcher.matches()) {
            String name = rangeMatcher.group(1);
            int lowerRange = Integer.parseInt(rangeMatcher.group(2));
            int upperRange = Integer.parseInt(rangeMatcher.group(3));

            if(lowerRange < upperRange) {
                return IntStream.rangeClosed(lowerRange, upperRange).mapToObj(i -> name + i).collect(Collectors.toList());
            } else {
                throw new IllegalArgumentException("lower range must be small than upper range on " + hostList);
            }
        } else if(hostList.matches("\\S+(,\\s*\\S+)*")) {
            return Splitter.on(',').trimResults().omitEmptyStrings().splitToList(hostList);
        } else {
            throw new IllegalArgumentException("Host list must be a comma separated list of host names, or in the form hostName{1-n}");
        }
    }
