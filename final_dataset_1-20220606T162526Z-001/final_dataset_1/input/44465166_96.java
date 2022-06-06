@Override
    public Set<Feature> getFeatures(Constituent c) throws EdisonException {

        TextAnnotation ta = c.getTextAnnotation();

        int start = c.getStartSpan() - contextSize;
        int end = c.getEndSpan() + contextSize;

        if (start < 0)
            start = 0;

        if (end >= ta.size())
            end = ta.size();

        Set<Feature> features = new LinkedHashSet<>();
        for (int i = start; i < end; i++) {

            if (ignoreConstituent)
                if (c.getStartSpan() <= i && i < c.getEndSpan())
                    continue;

            for (FeatureExtractor f : this.generators) {

                Constituent neighbor = new Constituent("TMP", "TMP", ta, i, i + 1);

                Set<Feature> feats = f.getFeatures(neighbor);

                for (Feature feat : feats) {
                    String preamble = "context";
                    if (specifyIndex) {
                        String index = "*";
                        if (i < c.getStartSpan())
                            index = (i - c.getStartSpan()) + "";
                        else if (i >= c.getEndSpan())
                            index = (i - c.getEndSpan() + 1) + "";
                        preamble += index;
                    }
                    preamble += ":";

                    features.add(feat.prefixWith(preamble + f.getName()));
                }
            }
        }
        return features;

    }
