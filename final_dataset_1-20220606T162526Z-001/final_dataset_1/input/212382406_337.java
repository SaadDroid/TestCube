Pipeline openPipeline(PipelineID pipelineId) throws IOException {
    Pipeline pipeline = pipelineStateMap.getPipeline(pipelineId);
    if (pipeline.isClosed()) {
      throw new IOException("Closed pipeline can not be opened");
    }
    if (pipeline.getPipelineState() == PipelineState.ALLOCATED) {
      LOG.info("Pipeline {} moved to OPEN state", pipeline);
      pipeline = pipelineStateMap
          .updatePipelineState(pipelineId, PipelineState.OPEN);
    }
    return pipeline;
  }
