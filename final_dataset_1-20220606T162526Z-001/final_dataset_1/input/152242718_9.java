protected static List<String> getIPFromInputStream(BufferedReader reader) {

        if (reader != null) {
            Set<String> allLines = new LinkedHashSet<>();
            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    Matcher matcher = kIPPattern.matcher(line);
                    if (matcher.matches()) {
                        allLines.add(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return allLines.stream().collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
