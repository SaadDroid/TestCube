public Job submit(String name, TaskGraph taskGraph, JobCompletionListener listener, boolean persistent)
            throws Exception {
        return initJob(name, taskGraph, null, listener, null, persistent);
    }
