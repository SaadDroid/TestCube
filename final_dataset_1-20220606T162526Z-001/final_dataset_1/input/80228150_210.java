public Void run(EntityManager em, CompleteJobTransactionInput param) throws Exception {
        T entity = em.find(this.entityType, param.getEntityId());

        if (entity == null) {
            throw new IllegalArgumentException(String.format("Entity with Id '%d' does not exist.", param.getEntityId()));
        }

        JobRecord jobRecord = em.find(JobRecord.class, param.getJobId());

        if (jobRecord == null) {
            throw new IllegalArgumentException(String.format("Job record with id '%d' does not exist.", param.getJobId()));
        }

        entity.setLastJob(em.find(JobRecord.class, param.getJobId()));
        OSCEntityManager.update(em, entity, this.txBroadcastUtil);

        return null;
    }
