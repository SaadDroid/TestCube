protected String createMergeValue(String leftSource, String rightSource, String parameter, long leftTimeStamp,
            long rightTimeStamp, SurvivorShipAlgorithmEnum survivorShipAlgorithmEnum, String leftValue,
            String rightValue, String mergedValue, AttributeValues<String> mergedValues) {
        BigDecimal leftNumberValue;
        BigDecimal rightNumberValue;
        if (leftValue == null) {
            return rightValue;
        } else if (rightValue == null) {
            return leftValue;
        }
        long leftValueLength = leftValue.codePoints().count();
        long rightValueLength = rightValue.codePoints().count();
        switch (survivorShipAlgorithmEnum) {
        case CONCATENATE:
            if (StringUtils.isEmpty(parameter)) {
                return leftValue + rightValue;
            } else {
                return leftValue + parameter + rightValue;
            }
        case LARGEST:
            leftNumberValue = parseNumberValue(leftValue);
            rightNumberValue = parseNumberValue(rightValue);
            if (leftNumberValue == null) {
                return rightValue;
            }
            if (rightNumberValue == null) {
                return leftValue;
            }
            if (leftNumberValue.compareTo(rightNumberValue) >= 0) {
                return leftValue;
            } else {
                return rightValue;
            }
        case SMALLEST:
            leftNumberValue = parseNumberValue(leftValue);
            rightNumberValue = parseNumberValue(rightValue);
            if (leftNumberValue == null) {
                return rightValue;
            }
            if (rightNumberValue == null) {
                return leftValue;
            }
            if (leftNumberValue.compareTo(rightNumberValue) <= 0) {
                return leftValue;
            } else {
                return rightValue;
            }
        case MOST_RECENT:
            if (leftTimeStamp >= rightTimeStamp) {
                return leftValue;
            } else {
                return rightValue;
            }
        case MOST_ANCIENT:
            if (leftTimeStamp <= rightTimeStamp) {
                return leftValue;
            } else {
                return rightValue;
            }
        case PREFER_TRUE:
            if (Boolean.parseBoolean(leftValue) || Boolean.parseBoolean(rightValue)) {
                return "true"; //$NON-NLS-1$
            } else {
                return "false"; //$NON-NLS-1$
            }
        case PREFER_FALSE:
            if (Boolean.parseBoolean(leftValue) && Boolean.parseBoolean(rightValue)) {
                return "true"; //$NON-NLS-1$
            } else {
                return "false"; //$NON-NLS-1$
            }
        case MOST_COMMON:
            return mergedValues.mostCommon();
        case LONGEST:
            if (leftValueLength >= rightValueLength) {
                return leftValue;
            } else {
                return rightValue;
            }
        case SHORTEST:
            if (leftValueLength <= rightValueLength) {
                return leftValue;
            } else {
                return rightValue;
            }
        case MOST_TRUSTED_SOURCE:
            String mostTrustedSourceName = parameter;
            if (mostTrustedSourceName == null) {
                throw new IllegalStateException("Survivorship 'most trusted source' must specify a trusted source."); //$NON-NLS-1$
            }
            if (mostTrustedSourceName.equals(rightSource)) {
                return rightValue;
            } else {
                // r1 and r2 are not from a trusted source, return first value
                return leftValue;
            }
        }
        return null;

    }
