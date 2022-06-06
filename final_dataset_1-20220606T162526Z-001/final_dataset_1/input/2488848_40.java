@Override
    public void prepare(final int start, final int end, final List<SortConstraint> sortConstraints) {
        Assert.notNull(sortConstraints, "sortContraints");
        sessionFactory.execute(new SessionCallback<Void>() {
            @Override
            public Void doInSession(Session session) {
                prepare(session, start, end, sortConstraints);
                return null;
            }

        });
    }
