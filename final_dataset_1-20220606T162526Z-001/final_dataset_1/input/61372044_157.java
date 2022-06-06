public String nextHost() {
        validateCanRotate();
        incrementHostIndex();
        return hosts.get(hostIndex);
    }
