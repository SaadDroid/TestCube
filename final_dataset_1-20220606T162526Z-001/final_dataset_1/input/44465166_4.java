@Override
    public TextAnnotation getTextAnnotation(TextAnnotation ta) {
        for (String dataset : getAllDatasets()) {
            final ConcurrentMap<Integer, byte[]> data = getMap(dataset);
            if(data.containsKey(ta.getTokenizedText().hashCode())) {
                byte[] taData = data.get(ta.getTokenizedText().hashCode());
                return SerializationHelper.deserializeTextAnnotationFromBytes(taData);
            }
        }
        return null;
    }
