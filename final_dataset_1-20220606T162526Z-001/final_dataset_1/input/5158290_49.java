@Override
    public String toString() {
        final StringBuffer s = new StringBuffer();
        final Iterator<Individual> iIt = indies.iterator();
        DecimalFormat df = new DecimalFormat("#0.00");
        while (iIt.hasNext()) {
            final Individual ind = iIt.next();
            final String f = df.format(ind.getFitness().getDouble());
            s.append(f);
            if(iIt.hasNext()) {
                s.append(",");
            }
        }
        return s.toString();
    }
