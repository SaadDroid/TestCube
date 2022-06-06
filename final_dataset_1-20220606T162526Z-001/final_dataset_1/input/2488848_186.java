@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mappedProperty.toString());
        sb.append(" {");
        boolean first = true;
        for (MappedPredicate predicate : predicatePath) {
            sb.append(' ');
            if (predicate.inv()) {
                sb.append('^');
            } else if (!first) {
                sb.append('.');
            }
            // sb.append(predicate.getReadableURI());
            sb.append(predicate.toString());
            first = false;
        }
        sb.append(" }");
        return sb.toString();
    }
