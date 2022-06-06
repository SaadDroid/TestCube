public List<PTVProgramStockInformation> buildPTVProgramStockInformation(PTVProgram ptvProgram) throws LMISException {
        List<PTVProgramStockInformation> ptvProgramStocksInformation = new ArrayList<>();
        List<Product> products = productRepository.getProductsByCodes(getProductCodes());
        for (Product product : products) {
            PTVProgramStockInformation ptvProgramStockInformation = new PTVProgramStockInformation();
            ptvProgramStockInformation.setProduct(product);
            ptvProgramStockInformation.setPtvProgram(ptvProgram);
            List<ServiceDispensation> serviceDispensations = serviceDispensationBuilder.buildInitialServiceDispensations(ptvProgramStockInformation);
            ptvProgramStockInformation.setServiceDispensations(serviceDispensations);
            setStockCardInformation(product, ptvProgramStockInformation);
            ptvProgramStocksInformation.add(ptvProgramStockInformation);
        }
        return ptvProgramStocksInformation;
    }
