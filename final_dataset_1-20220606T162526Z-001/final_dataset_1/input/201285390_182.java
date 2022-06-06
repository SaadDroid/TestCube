public static String wrapNamespace(String namespace, String resourceWithOutNamespace) {
        if (StringUtils.isEmpty(namespace) || StringUtils.isEmpty(resourceWithOutNamespace)) {
            return resourceWithOutNamespace;
        }

        if (isSystemResource(resourceWithOutNamespace) || isAlreadyWithNamespace(resourceWithOutNamespace, namespace)) {
            return resourceWithOutNamespace;
        }

        String resourceWithoutRetryAndDLQ = withOutRetryAndDLQ(resourceWithOutNamespace);
        StringBuffer strBuffer = new StringBuffer();

        if (isRetryTopic(resourceWithOutNamespace)) {
            strBuffer.append(MixAll.RETRY_GROUP_TOPIC_PREFIX);
        }

        if (isDLQTopic(resourceWithOutNamespace)) {
            strBuffer.append(MixAll.DLQ_GROUP_TOPIC_PREFIX);
        }

        return strBuffer.append(namespace).append(NAMESPACE_SEPARATOR).append(resourceWithoutRetryAndDLQ).toString();

    }
