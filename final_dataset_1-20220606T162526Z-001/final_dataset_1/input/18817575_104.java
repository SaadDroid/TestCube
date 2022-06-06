double getTotalMappingDuration() {
        double totalDuration = 0L;
        double leftBoundary = 0;
        for (int i = 0; i < this.mappingDurationFrequencies.length; ++i) {
            double rightBoundary = this.indexBoundaries[i];
            double intervalMean = (leftBoundary + rightBoundary) / 2;
            totalDuration += intervalMean * this.mappingDurationFrequencies[i];
            leftBoundary = this.indexBoundaries[i];
        }
        return totalDuration;
    }
