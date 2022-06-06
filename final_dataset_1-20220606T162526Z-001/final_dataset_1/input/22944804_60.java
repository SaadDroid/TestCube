public DevicePrint getDevicePrint(HttpServletRequest request) {
        DevicePrint devicePrint = new DevicePrint();
        for (Extractor extractor : extractorFactory.getExtractors()) {
            extractor.extractData(devicePrint, request);
        }
        return devicePrint;
    }
