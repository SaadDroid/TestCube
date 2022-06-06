@Override
  public Pipeline getPipeline(HddsProtos.PipelineID pipelineID)
      throws IOException {
    return scmClient.getPipeline(pipelineID);
  }
