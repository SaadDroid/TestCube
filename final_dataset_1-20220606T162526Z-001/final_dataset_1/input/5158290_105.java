public void stringToRange(String s) {
        String[] sA = s.split(";");
        this.start = new double[sA.length];
        this.stop = new double[sA.length];
        this.step = new double[sA.length];
        this.random = new boolean[sA.length];
        for (int j = 0; j < sA.length; j++) {
            String[] sA_2 = sA[j].split("\\s*eq\\s*");
            for (int i = 0; i < sA_2.length; i++) {
                if (sA_2[i].contains("[")) {
                    String sA_3[] = sA_2[i].split(":");
                    this.start[j] = Double.parseDouble(sA_3[0].substring(1));
                    this.step[j] = Double.parseDouble(sA_3[1]);
                    this.stop[j] = Double.parseDouble(sA_3[2].substring(0, (sA_3[2].length() - 1)));
                    this.random[j] = false;
                } else {
                    if (sA_2[i].contains("(")) {
                        String sA_3[] = sA_2[i].split(",");
                        this.start[j] = Double.parseDouble(sA_3[0].substring(4));
                        this.step[j] = Double.parseDouble(sA_3[1]);
                        this.stop[j] = Double.parseDouble(sA_3[2].substring(0, (sA_3[2].length() - 1)));
                        this.random[j] = true;
                    }
                }
            }
        }
        this.totalSamples = this.getTotalSamples();
    }
