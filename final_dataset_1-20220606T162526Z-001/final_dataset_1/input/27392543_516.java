@Override
  public RecordStreamWithMetadata<DO, SO> processStream(RecordStreamWithMetadata<DI, SI> inputStream,
      WorkUnitState workUnitState) throws SchemaConversionException {
    init(workUnitState);
    this.outputGlobalMetadata = GlobalMetadata.<SI, SO>builderWithInput(inputStream.getGlobalMetadata(),
        Optional.fromNullable(convertSchema(inputStream.getGlobalMetadata().getSchema(), workUnitState))).build();
    Flowable<StreamEntity<DO>> outputStream =
        inputStream.getRecordStream()
            .flatMap(in -> {
              if (in instanceof ControlMessage) {
                ControlMessage out = (ControlMessage) in;

                getMessageHandler().handleMessage((ControlMessage) in);

                // update the output schema with the new input schema from the MetadataUpdateControlMessage
                if (in instanceof MetadataUpdateControlMessage) {
                  this.outputGlobalMetadata = GlobalMetadata.<SI, SO>builderWithInput(
                      ((MetadataUpdateControlMessage) in).getGlobalMetadata(),
                      Optional.fromNullable(convertSchema((SI)((MetadataUpdateControlMessage) in).getGlobalMetadata()
                          .getSchema(), workUnitState))).build();
                  out = new MetadataUpdateControlMessage<SO, DO>(this.outputGlobalMetadata);
                }

                return Flowable.just(((ControlMessage<DO>) out));
              } else if (in instanceof RecordEnvelope) {
                RecordEnvelope<DI> recordEnvelope = (RecordEnvelope<DI>) in;
                return convertRecordEnvelope(this.outputGlobalMetadata.getSchema(), recordEnvelope, workUnitState);
              } else {
                throw new UnsupportedOperationException();
              }
            }, 1);
    outputStream = outputStream.doOnComplete(this::close);
    return inputStream.withRecordStream(outputStream, this.outputGlobalMetadata);
  }
