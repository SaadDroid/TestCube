public static BucketModel transform(BucketEntity bucketEntity) {
        BucketModel bucketModel = null;
        if (bucketEntity != null) {
            bucketModel = new BucketModel();
            if (bucketEntity.getTasks() != null) {
                bucketModel.setTasks(transform(bucketEntity.getTasks()));
            }
        }

        return bucketModel;
    }
