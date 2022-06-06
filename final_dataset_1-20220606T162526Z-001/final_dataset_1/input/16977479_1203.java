public String substitute(List<String> values) throws IllegalArgumentException {
        if (values == null) {
            throw new IllegalArgumentException("values is null");
        }
        Iterator<String> iter = values.iterator();
        StringBuilder sb = new StringBuilder();
        for (UriChunk chunk : uriChunks) {
            if (chunk instanceof Variable) {
                Variable var = (Variable)chunk;
                if (iter.hasNext()) {
                    String value = iter.next();
                    if (!var.matches(value)) {
                        throw new IllegalArgumentException("Value '" + value + "' does not match variable "
                                                           + var.getName() + " with pattern "
                                                           + var.getPattern());
                    }
                    sb.append(value);
                } else {
                    sb.append(var);
                }
            } else {
                sb.append(chunk);
            }
        }
        return sb.toString();
    }
