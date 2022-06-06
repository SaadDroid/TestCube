public static double calculateStDevMemLoad(Collection<ServerLoad> serversLoad) {
        double sumOfDifferences = 0;
        double avgMemLoad = calculateAvgMemLoad(serversLoad);
        for (ServerLoad serverLoad: serversLoad) {
            sumOfDifferences += Math.pow((serverLoad.getRamLoad() - avgMemLoad), 2);
        }
        return Math.sqrt(sumOfDifferences/serversLoad.size());
    }
