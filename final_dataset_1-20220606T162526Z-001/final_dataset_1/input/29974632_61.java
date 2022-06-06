@Override
    public String lookupComponentNameByHostAndPort(final String hostName, final int port) {
        if(productMap == null) {
            final Map<String, Map<Integer, String>> tempProductMap = new HashMap<>();
            addEntriesToProductMap(tempProductMap, ProductType.AXE.getFriendlyName(), content.getHost(), content.getPort(), content.getServicePort());
            addEntriesToProductMap(tempProductMap, ProductType.VIEW.getFriendlyName(), view.getHost(), view.getPort(), view.getServicePort());

            if(!"default".equals(login.getMethod())) {
                addEntriesToProductMap(tempProductMap, ProductType.UASERVER.getFriendlyName(), login.getCommunity().getHost(), login.getCommunity().getPort(), login.getCommunity().getServicePort());
            }

            if(isOptionalComponentEnabled(queryManipulation)) {
                addEntriesToProductMap(tempProductMap, ProductType.QMS.getFriendlyName(), queryManipulation.getServer().getHost(), queryManipulation.getServer().getPort(), queryManipulation.getServer().getServicePort());
            }

            if(isOptionalComponentEnabled(answerServer)) {
                addEntriesToProductMap(tempProductMap, ProductType.ANSWERSERVER.getFriendlyName(), answerServer.getServer().getHost(), answerServer.getServer().getPort(), answerServer.getServer().getServicePort());
            }

            if(isOptionalComponentEnabled(entitySearch)) {
                addEntriesToProductMap(tempProductMap, ProductType.AXE.getFriendlyName(), entitySearch.getServer().getHost(), entitySearch.getServer().getPort(), entitySearch.getServer().getServicePort());
            }

            if(isOptionalComponentEnabled(statsServer)) {
                addEntriesToProductMap(tempProductMap, statsServer.getServer().getHost(), ProductType.STATS.getFriendlyName(), statsServer.getServer().getPort(), statsServer.getServer().getServicePort());
            }

            productMap = tempProductMap;
        }

        return productMap.getOrDefault(hostName, Collections.emptyMap()).get(port);
    }
