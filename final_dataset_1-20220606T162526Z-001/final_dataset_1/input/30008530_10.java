public void resetOffset() {
		if (LOGGER.isInfoEnabled())
			LOGGER.info( "Reset offset for " + m_clientId);

		m_readOffset = fetchResetOffset(m_config.getAutoOffsetReset());

		if (m_readOffset < 0)
			throw new RuntimeException("Fatal errors in resetting offset for "
					+ m_clientId);
		commitOffset();

		if (LOGGER.isInfoEnabled())
			LOGGER.info( m_clientId + ": offset is reset to "
					+ m_readOffset);
	}
