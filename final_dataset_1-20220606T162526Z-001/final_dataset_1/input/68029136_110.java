@Override
    public int compareTo(ResourceEditProperty o) {

        Integer cardinality = o.getCardinalityProperty();
        if (cardinality == null) {
            cardinality = Integer.MAX_VALUE;
        }
        Integer myCardinality = getCardinalityProperty();
        if (myCardinality == null) {
            myCardinality = Integer.MAX_VALUE;
        }

        if (!myCardinality.equals(cardinality)) {
            return myCardinality - cardinality;
        }

        // compare displayed name such that the displayed list is sorted
        if (o.getPropertyDisplayName() != null && getPropertyDisplayName() != null) {
            return getPropertyDisplayName().compareToIgnoreCase(o.getPropertyDisplayName());
        }

        return 0;
    }
