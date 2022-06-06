public static void setJobIdOffset(int jobIdOffset) {
        JobPreconditions.checkArgumentNonnegative(jobIdOffset, "offset can't be negative");
        if (jobIdOffset > JobIdsInternal.RESERVED_JOB_ID_RANGE_START - 500) {
            throw new IllegalArgumentException("offset is too close to Integer.MAX_VALUE");
        }

        JobConfig.jobIdOffset = jobIdOffset;
    }
