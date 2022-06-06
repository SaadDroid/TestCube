public Cluster getClusterInfo(String clusterName) {

        String gangliaXml = null;
        ArrayList<Cluster> cluster_list = new ArrayList<Cluster>();

        Cluster ret_cluster = null;
        try {
            //
            ParseGanglia p = new ParseGanglia(gangliaCollectorIP, gangliaPort, gangliaPortQuery);
            gangliaXml = p.queryGanglia("/" + clusterName);
            cluster_list = (ArrayList<Cluster>) p.parseGangliaXml(gangliaXml);

        } catch (MonitoringException ex) {
            Logger.getLogger(Ganglia.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Cluster cluster : cluster_list) {

            if (cluster.getName().equals(clusterName)) {
                ret_cluster = cluster;
            }
        }

        return ret_cluster;
    }
