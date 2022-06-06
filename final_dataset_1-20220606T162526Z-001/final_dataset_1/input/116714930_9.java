public void maybeUnpause(long currentTime) {
        if (!paused) {
            LOGGER.debug("Partition [{}] not paused. Nothing to do", topicPartition);
            return;
        }

        if (currentTime >= pausedTillTime) {
            if(LOGGER.isInfoEnabled()){
                LOGGER.info("Unpausing partition [{}] as the current time [{}] is >= paused time [{}]",
                        new Object[] { topicPartition, new Date(currentTime), new Date(pausedTillTime) });
            }

            // This method does not throw a KafkaException
            consumer.resume(Collections.singleton(topicPartition));

            PAUSED_PARTITIONS.dec();
            paused = false;

            // Reset successful results to 100% successful
            resetResults();
        }
        else{
            if (LOGGER.isDebugEnabled())
                LOGGER.debug("Not unpausing partition [{}] as the current time [{}] is < paused time [{}]",
                    topicPartition, currentTime, pausedTillTime);
        }
    }
