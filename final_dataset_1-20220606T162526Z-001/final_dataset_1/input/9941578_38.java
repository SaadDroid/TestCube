void onMerlinBind(NetworkStatus networkStatus) {
        Logger.d("onBind");
        for (Bindable bindable : registerables()) {
            bindable.onBind(networkStatus);
        }
    }
