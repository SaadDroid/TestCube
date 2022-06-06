private boolean vertexReRunning(Vertex vertex) {
    reRunningVertices.add(vertex.getVertexId());
    numSuccessfulVertices--;
    addDiagnostic("Vertex re-running"
      + ", vertexName=" + vertex.getName()
      + ", vertexId=" + vertex.getVertexId());
    
    if (!commitAllOutputsOnSuccess) {
      // partial output may already have been committed. fail if so
      List<VertexGroupInfo> groupList = vertexGroupInfo.get(vertex.getName());
      if (groupList != null) {
        for (VertexGroupInfo groupInfo : groupList) {
          if (groupInfo.committed) {
            LOG.info("Aborting job as committed vertex: "
                + vertex.getVertexId() + " is re-running");
            enactKill(DAGTerminationCause.COMMIT_FAILURE,
                VertexTerminationCause.COMMIT_FAILURE);
            return true;
          }
        }
      }
    }
    return false;
  }
