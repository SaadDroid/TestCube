@Override
    public Neighbor<double[], E> nearest(double[] q) {
        int index = -1;
        double nearest = Double.MAX_VALUE;

        for (int i : getCandidates(q)) {
            double[] x = keys.get(i);
            if (q != x) {
                double distance = MathEx.distance(q, x);
                if (distance < nearest) {
                    index = i;
                    nearest = distance;
                }
            }
        }
        
        return index == -1 ? null : new Neighbor<>(keys.get(index), data.get(index), index, nearest);
    }
