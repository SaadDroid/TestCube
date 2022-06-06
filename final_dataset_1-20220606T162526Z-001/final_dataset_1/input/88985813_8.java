long getConsistentApplicationModelVersion() {
        long applicationModelVersion = 0;
        if (m_beforePostProcessingVersion > 0) {
            applicationModelVersion = m_beforePostProcessingVersion;
        }
        // since we already validate version after postprocessing no need to validate it again, so if set override the initial version
        if (m_afterPostProcessingVersion > 0) {
            applicationModelVersion = m_afterPostProcessingVersion;
        }
        return applicationModelVersion;
    }
