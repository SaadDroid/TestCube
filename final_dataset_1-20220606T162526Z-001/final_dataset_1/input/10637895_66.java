public String getProfilerOptions(String jvmOpts, String vertexName,
      int taskIdx) {
    jvmOpts = (jvmOpts == null) ? "" : jvmOpts;
    vertexName = vertexName.replaceAll(" ", "");
    String result =
        jvmProfilingOpts.replaceAll("__VERTEX_NAME__", vertexName)
          .replaceAll("__TASK_INDEX__", Integer.toString(taskIdx));
    result = (jvmOpts + " " + result);

    LOG.info("Profiling option added to vertexName=" + vertexName
        + ", taskIdx=" + taskIdx + ", jvmOpts=" + result.trim());

    return result.trim();
  }
