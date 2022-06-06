@Override
	public boolean process( JobDefinition od, String clusterID, String workerID ) {
		log.info( "Back Load Process called with: {}", od );
        errorBuffer.setLength( 0 );
		try {
			BusinessObjectFormat dmFormat = dataMgmtSvc.getDMFormat( od );
			JobSubmitterInfo jsi = JobSubmitterInfo.builder()
					.herdNotificationId( od.getId() )
					.partitionKey( dmFormat.getPartitionKey() )
					.namespace( od.getObjectDefinition().getNameSpace() )
					.objectName( od.getObjectDefinition().getObjectName() )
					.usage( od.getObjectDefinition().getUsageCode() )
					.fileType( od.getObjectDefinition().getFileType() )
					.workflowType( ObjectProcessor.WF_TYPE_MANAGED )
					.tableSchema( dmFormat.getSchema() )
					.correlation( od.getCorrelation() )
					.build();

			identifyPartitionsAndBackLoad( od, jsi );

//			addGatherStatsJob( jsi );

		} catch ( Exception e ) {
			log.error( "Problem encountered in Back loading processor: {}", e.getMessage(), e );
			errorBuffer.append( e.getMessage() );
			return false;
		}

		log.info( "Back loading jobs submitted successfully" );
		return true;
	}
