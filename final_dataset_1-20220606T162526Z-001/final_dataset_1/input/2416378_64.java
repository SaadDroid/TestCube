@Override
    public String marshal(MergeableTags mergeableTags) throws Exception {
        if (mergeableTags == null) {
            return null;
        }
        if (mergeableTags.getTags().isEmpty()) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        boolean first = true;

        for (String s : mergeableTags.getTags()) {
            if (first) {
                first = false;
            } else {
                builder.append(SPLIT);
            }
            builder.append(s);
        }

        return builder.toString();
    }
