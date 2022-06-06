@Override
    @Transactional(rollbackFor = Throwable.class)
    public void delete(AssignmentConfig assignmentConfig) {
        getSession().delete(assignmentConfig);
    }
