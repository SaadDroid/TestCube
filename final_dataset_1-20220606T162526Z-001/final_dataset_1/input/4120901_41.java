@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		try {
			context.refresh();
		} catch (Throwable t) {
			logger.error("luanch Spring Hadoop job failed.", t);
		}
		return RepeatStatus.FINISHED;
	}
