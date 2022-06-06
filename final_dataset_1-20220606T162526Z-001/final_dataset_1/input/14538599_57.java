@Override
    public void save(P pojo) {
        completeSync(group -> save(group, StatementOptionsBuilder.empty(), pojo, defaultTtl));
    }
