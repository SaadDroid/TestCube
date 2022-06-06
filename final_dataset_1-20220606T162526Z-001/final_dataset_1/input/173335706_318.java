public static AbstractTask newTask(TaskExecutionContext taskExecutionContext, Logger logger) throws IllegalArgumentException {
        TaskType anEnum = EnumUtils.getEnum(TaskType.class, taskExecutionContext.getTaskType());
        if (anEnum == null) {
            logger.error("not support task type: {}", taskExecutionContext.getTaskType());
            throw new IllegalArgumentException("not support task type");
        }
        switch (anEnum) {
            case SHELL:
            case WATERDROP:
                return new ShellTask(taskExecutionContext, logger);
            case PROCEDURE:
                return new ProcedureTask(taskExecutionContext, logger);
            case SQL:
                return new SqlTask(taskExecutionContext, logger);
            case MR:
                return new MapReduceTask(taskExecutionContext, logger);
            case SPARK:
                return new SparkTask(taskExecutionContext, logger);
            case FLINK:
                return new FlinkTask(taskExecutionContext, logger);
            case PYTHON:
                return new PythonTask(taskExecutionContext, logger);
            case HTTP:
                return new HttpTask(taskExecutionContext, logger);
            case DATAX:
                return new DataxTask(taskExecutionContext, logger);
            case SQOOP:
                return new SqoopTask(taskExecutionContext, logger);
            default:
                logger.error("not support task type: {}", taskExecutionContext.getTaskType());
                throw new IllegalArgumentException("not support task type");
        }
    }
