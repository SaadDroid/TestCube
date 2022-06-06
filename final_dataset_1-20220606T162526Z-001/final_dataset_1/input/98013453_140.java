@Override
    @GraphTransaction
    public BulkImportResponse bulkCreateOrUpdateBusinessAttributes(InputStream inputStream, String fileName) throws AtlasBaseException {
        BulkImportResponse ret = new BulkImportResponse();

        try {
            if (StringUtils.isBlank(fileName)) {
                throw new AtlasBaseException(AtlasErrorCode.FILE_NAME_NOT_FOUND, fileName);
            }

            List<String[]>           fileData              = FileUtils.readFileData(fileName, inputStream);
            Map<String, AtlasEntity> attributesToAssociate = getBusinessMetadataDefList(fileData, ret);

            for (AtlasEntity entity : attributesToAssociate.values()) {
                try {
                    addOrUpdateBusinessAttributes(entity.getGuid(), entity.getBusinessAttributes(), true);

                    BulkImportResponse.ImportInfo successImportInfo = new BulkImportResponse.ImportInfo(entity.getGuid(), entity.getBusinessAttributes().toString());

                    ret.setSuccessImportInfoList(successImportInfo);
                }catch (Exception e) {
                    LOG.error("Error occurred while updating BusinessMetadata Attributes for Entity " + entity.getGuid());

                    BulkImportResponse.ImportInfo failedImportInfo = new BulkImportResponse.ImportInfo(entity.getGuid(), entity.getBusinessAttributes().toString(), BulkImportResponse.ImportStatus.FAILED, e.getMessage());

                    ret.getFailedImportInfoList().add(failedImportInfo);
                }
            }
        } catch (IOException e) {
            LOG.error("An Exception occurred while uploading the file {}", fileName, e);

            throw new AtlasBaseException(AtlasErrorCode.FAILED_TO_UPLOAD, e);
        }

        return ret;
    }
