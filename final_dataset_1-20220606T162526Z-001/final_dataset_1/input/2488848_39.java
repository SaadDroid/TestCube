@Override
    public int getAvailableRows() {
        return sessionFactory.execute(new SessionCallback<Integer>() {
            @Override
            public Integer doInSession(Session session) {
                BeanQuery beanQuery = session.from(entityPath);
                if (conditions != null) {
                    beanQuery.where(conditions);
                }
                return (int) beanQuery.count();
            }
        });
    }
