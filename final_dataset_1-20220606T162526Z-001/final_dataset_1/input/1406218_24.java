public <T> T getMetaData(String key)
    {
        T result = null;
        if (!this.metaDataStack.isEmpty()) {
            for (MetaData metaData : this.metaDataStack) {
                result = (T) metaData.getMetaData(key);
                if (result != null) {
                    break;
                }
            }
        }
        return result;
    }
