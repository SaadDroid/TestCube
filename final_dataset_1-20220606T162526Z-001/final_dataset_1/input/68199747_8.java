@Override
    public Observable<Task> getTask(@NonNull final String taskId) {
        checkNotNull(taskId);

        final Task cachedTask = getTaskWithId(taskId);

        // Respond immediately with cache if available
        if (cachedTask != null) {
            return Observable.just(cachedTask);
        }

        // Load from server/persisted if needed.

        // Do in memory cache update to keep the app UI up to date
        if (mCachedTasks == null) {
            mCachedTasks = new LinkedHashMap<>();
        }

        // Is the task in the local data source? If not, query the network.
        Observable<Task> localTask = getTaskWithIdFromLocalRepository(taskId);
        Observable<Task> remoteTask = mTasksRemoteDataSource
                .getTask(taskId)
                .doOnNext(new Action1<Task>() {
                    @Override
                    public void call(Task task) {
                        mTasksLocalDataSource.saveTask(task);
                        mCachedTasks.put(task.getId(), task);
                    }
                });

        return Observable.concat(localTask, remoteTask).first()
                .map(new Func1<Task, Task>() {
                    @Override
                    public Task call(Task task) {
                        if (task == null) {
                            throw new NoSuchElementException("No task found with taskId " + taskId);
                        }
                        return task;
                    }
                });
    }
