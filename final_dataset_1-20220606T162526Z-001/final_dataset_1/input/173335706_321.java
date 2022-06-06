@Override
    public void init() throws Exception {
        logger.info("sqoop task params {}", taskExecutionContext.getTaskParams());
        sqoopParameters =
                JSONUtils.parseObject(taskExecutionContext.getTaskParams(),SqoopParameters.class);
        if (!sqoopParameters.checkParameters()) {
            throw new RuntimeException("sqoop task params is not valid");
        }

    }
