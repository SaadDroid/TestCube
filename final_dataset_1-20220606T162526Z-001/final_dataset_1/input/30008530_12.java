public void commitOffset() {
		if (!m_zkConnector.exists(m_offsetPath))
			m_zkConnector.create(m_offsetPath, false);
		m_zkConnector.writeString(m_offsetPath, String.valueOf(m_readOffset));

		if (LOGGER.isInfoEnabled())
			LOGGER.info( m_clientId + ": offset is committed with "
					+ m_readOffset);
	}
