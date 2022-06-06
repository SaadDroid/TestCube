public Observable<PTVProgram> savePTVProgram(final boolean isCompleted) {
        return Observable.create(new Observable.OnSubscribe<PTVProgram>() {
            @Override
            public void call(Subscriber<? super PTVProgram> subscriber) {
                try {
                    if (ptvProgram == null) {
                        LMISException e = new LMISException("PTV Program cannot be null");
                        e.reportToFabric();
                        throw e;
                    }
                    setPTVProgramStatus(isCompleted);
                    PTVProgram ptvProgramSaved = ptvProgramRepository.save(ptvProgram);
                    subscriber.onNext(ptvProgramSaved);
                    subscriber.onCompleted();
                } catch (LMISException e) {
                    subscriber.onError(e);
                } catch (SQLException e) {
                    subscriber.onError(e);
                }
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
