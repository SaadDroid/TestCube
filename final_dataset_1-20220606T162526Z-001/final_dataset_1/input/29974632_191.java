@Override
    public void exportRecord(final OutputStream outputStream, final Iterable<String> values) throws IOException {
        try (final CSVPrinter csvPrinter = new CSVPrinter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), CSVFormat.EXCEL)) {
            csvPrinter.printRecord(values);
        }
    }
