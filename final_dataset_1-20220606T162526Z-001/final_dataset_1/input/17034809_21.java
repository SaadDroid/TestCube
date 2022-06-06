@Initialize
    public void initTempFile() throws Exception {
        if (_targetResource == null) {
            if (columnToBeSortedOn != null) {
                 tempFile = File.createTempFile("csv_file_analyzer", ".csv");
                _targetResource = new FileResource(tempFile);
            } else {
                _targetResource = file;
            }
        }
    }
