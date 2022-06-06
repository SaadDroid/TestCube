@Override
    public double getMatchingWeight(String[] record1, String[] record2) {
        double result = 0;
        // first loop on blocking variables indices
        if (blockedIndices != null) {
            for (int i = 0; i < super.blockedIndices.length; i++) {
                int blockedIdx = blockedIndices[i];
                double pa = computeMatchingWeight(blockedIdx, record1, record2);
                if (pa < super.blockingThreshold) {
                    return 0; // we break the computation here because it is considered as a non-match.
                }
                // else compute weight
                result += pa * attributeWeights[blockedIdx];
            }
        }

        // loop on other indices
        for (int j = 0; j < getUsedIndicesNotblocked().length; j++) {
            int usedIdx = usedIndicesNotblocked[j];
            double pa = computeMatchingWeight(usedIdx, record1, record2);
            result += pa * attributeWeights[usedIdx];
        }

        if (result > 1.0) {
            final BigDecimal l = new BigDecimal(Double.toString(result));
            result = l.setScale(1, BigDecimal.ROUND_DOWN).doubleValue();
        }

        return result;
    }
