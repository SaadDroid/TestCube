protected LiveData<Speaker> getSpeaker(long speakerId, boolean reload) {
        if (speakerLiveData.getValue() != null && !reload)
            return speakerLiveData;

        compositeDisposable.add(speakerRepository.getSpeaker(speakerId, reload)
            .compose(dispose(compositeDisposable))
            .doOnSubscribe(disposable -> progress.setValue(true))
            .doFinally(() -> progress.setValue(false))
            .doOnNext(speaker -> speakerLiveData.setValue(speaker))
            .flatMap(speaker -> sessionRepository.getSessionsUnderSpeaker(speakerId, reload))
            .toList()
            .subscribe(sessionList -> sessionLiveData.setValue(sessionList),
                throwable -> error.setValue(ErrorUtils.getMessage(throwable).toString())));

        return speakerLiveData;
    }
