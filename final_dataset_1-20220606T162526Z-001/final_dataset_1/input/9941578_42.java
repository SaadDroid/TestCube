void forward(ConnectivityChangeEvent connectivityChangeEvent) {
        if (matchesPreviousEndpointPingNetworkStatus(connectivityChangeEvent)) {
            return;
        }

        networkStatusRetriever.fetchWithPing(endpointPinger, endpointPingerCallback);
        lastEndpointPingNetworkStatus = connectivityChangeEvent.asNetworkStatus();
    }
