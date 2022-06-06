public String loadData() {
        String dataFileName = this.fileName;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(dataFileName)))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append('\n');
            }

            this.loaded = true;

            return sb.toString();
        } catch (Exception e) {
            LOGGER.error("File {} does not exist", dataFileName);
        }

        return null;
    }
