public boolean createContainer(String containerName) {
        Assert.notNull(containerName, BUCKET_NAME_CANNOT_BE_NULL);
        try {
            final S3Bucket bucket = s3Service.createBucket(new S3Bucket(containerName));
            return bucket != null;
        } catch (S3ServiceException e) {
            throw new StorageCommunicationException("Bucket creation problem", e);
        }

    }
