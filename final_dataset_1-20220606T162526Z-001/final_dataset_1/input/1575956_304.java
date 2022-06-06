@Override
    public List<String> resolve(List<String> names) {
        List<String> networkLocations = new ArrayList<String>(names.size());
        for (String name : names) {
            networkLocations.add(resolve(name));
        }
        return networkLocations;
    }
