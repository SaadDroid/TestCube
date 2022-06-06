protected long getTaskIdParameter() {
        final String taskId = getAttribute(TASK_ID);
        if (taskId == null) {
            throw new APIException("Attribute '" + TASK_ID + "' is mandatory");
        }
        return Long.parseLong(taskId);
    }
