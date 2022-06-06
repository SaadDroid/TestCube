public Observable<Regimen> saveRegimes(RegimeProductViewModel viewModel, final Regimen.RegimeType regimeType) {
        final String regimenName = viewModel.getShortCode();

        return Observable.create((Observable.OnSubscribe<Regimen>) subscriber -> {
            Regimen regimen = null;
            try {
                regimen = regimenRepository.getByNameAndCategory(regimenName, regimeType);
                if (regimen == null) {
                    regimen = new Regimen();
                    regimen.setType(regimeType);
                    regimen.setCode(regimeType + regimenName);
                    regimen.setName(regimenName);
                    regimen.setCustom(true);
                    regimenRepository.create(regimen);
                }
            } catch (LMISException e) {
                new LMISException(e, "ProductPresenter.saveRegimes").reportToFabric();
                subscriber.onError(e);
            }
            subscriber.onNext(regimen);
            subscriber.onCompleted();
        }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
    }
