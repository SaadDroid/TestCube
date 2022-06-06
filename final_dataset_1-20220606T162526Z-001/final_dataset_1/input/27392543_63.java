public static String newTaskId(String jobId, int sequence) {
    return Id.Task.create(Id.parse(jobId).get(Id.Parts.INSTANCE_NAME), sequence).toString();
  }
