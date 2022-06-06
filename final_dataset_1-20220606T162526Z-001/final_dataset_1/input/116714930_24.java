public Optional<ConsumerRecord<K, V>> nextRecord(final long timeout) {
        // Un-pause any paused partitions that have been suspended long enough
        maybeUnpausePartitions();

        // Try to commit eligible offsets if enough time has passed since last commit
        maybeCommitOffsetsForTime();

        // Select all partitions which have records to be processed
        List<ProcessingPartition<K, V>> partitionsToProcess = partitions.values().stream()
                .filter(ProcessingPartition::hasNextRecord)
                .collect(Collectors.toList());

        // If there are no partitions to process we need to fetch more data
        if (partitionsToProcess.isEmpty()) {
            LOGGER.debug("Polling kafka for more data");

            partitionsToProcessIndex = 0;
            ConsumerRecords<K, V> records = pollRecords(timeout);

            // If we paused commits un-pause them now as we should have re-joined the group if necessary
            pauseCommit = false;

            // Add records to each partition
            records.partitions().forEach(topicPartition -> {
                ProcessingPartition<K, V> processingPartition = partitions.get(topicPartition);

                if (processingPartition == null) {
                    LOGGER.debug("Read a record for which we don't have a processing partition for [{}]. Adding partition",
                            topicPartition);
                    processingPartition = buildPartition(topicPartition, config, consumer);
                    partitions.put(topicPartition, processingPartition);
                }

                // Add records to partition
                processingPartition.load(records.records(topicPartition));
            });

            POLL_MESSAGES.update(records.count());

            // Reload our partitions to process
            partitionsToProcess = partitions.values().stream()
                    .filter(ProcessingPartition::hasNextRecord)
                    .collect(Collectors.toList());
        }

        ConsumerRecord<K, V> record = null;

        // Loop until we either run out of records or find a valid record to process
        while (!partitionsToProcess.isEmpty() && record == null) {
            // If the number of partitions to process has changed outside of this code (i.e. partition became paused or
            // re-assigned) verify our index is still valid otherwise start back at zero
            if (partitionsToProcessIndex >= partitionsToProcess.size())
                partitionsToProcessIndex = 0;

            ProcessingPartition<K, V> processingPartition = partitionsToProcess.get(partitionsToProcessIndex);

            if (processingPartition.hasNextRecord()) {
                LOGGER.debug("Pulling record from partition [{}]", processingPartition.getTopicPartition());
                record = processingPartition.nextRecord();
            }
            else {
                LOGGER.debug("No more messages in partition [{}] removing from partitions to process",
                        processingPartition.getTopicPartition());
                partitionsToProcess.remove(partitionsToProcessIndex);
            }

            // Signal to process the next partition and wrap back to 0 if we go over
            if (!partitionsToProcess.isEmpty())
                partitionsToProcessIndex = (partitionsToProcessIndex + 1) % partitionsToProcess.size();
        }

        if (record != null)
            // Difference between when we read the value and when the record was written
            READ_LATENCY.update(System.currentTimeMillis() - record.timestamp());

        return Optional.ofNullable(record);
    }
