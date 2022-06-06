public static String withoutNamespace(String resourceWithNamespace) {
        if (StringUtils.isEmpty(resourceWithNamespace) || isSystemResource(resourceWithNamespace)) {
            return resourceWithNamespace;
        }

        StringBuffer strBuffer = new StringBuffer();
        if (isRetryTopic(resourceWithNamespace)) {
            strBuffer.append(MixAll.RETRY_GROUP_TOPIC_PREFIX);
        }
        if (isDLQTopic(resourceWithNamespace)) {
            strBuffer.append(MixAll.DLQ_GROUP_TOPIC_PREFIX);
        }

        String resourceWithoutRetryAndDLQ = withOutRetryAndDLQ(resourceWithNamespace);
        int index = resourceWithoutRetryAndDLQ.indexOf(NAMESPACE_SEPARATOR);
        if (index > 0) {
            String resourceWithoutNamespace = resourceWithoutRetryAndDLQ.substring(index + 1);
            return strBuffer.append(resourceWithoutNamespace).toString();
        }

        return resourceWithNamespace;
    }
