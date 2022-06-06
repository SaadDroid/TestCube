public ComparisonResult compareScreenResolution(String currentWidth, String currentHeight, String storedWidth,
            String storedHeight, long penaltyPoints) {

        ComparisonResult widthComparisonResult = compare(currentWidth, storedWidth, penaltyPoints);
        ComparisonResult heightComparisonResult = compare(currentHeight, storedHeight, penaltyPoints);

        if (widthComparisonResult.isSuccessful() && heightComparisonResult.isSuccessful()) {
            return new ComparisonResult(widthComparisonResult.getAdditionalInfoInCurrentValue()
                    || heightComparisonResult.getAdditionalInfoInCurrentValue());
        } else {
            return new ComparisonResult(penaltyPoints);
        }
    }
