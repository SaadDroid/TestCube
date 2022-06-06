public String toString() {
        Object[] oa = toArray();
        Object o;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < oa.length; i++) {
            o = oa[i];
            if (i > 0) {
                sb.append(", ");
            }
            if (o == null) {
                sb.append("null");
            } else {
                sb.append(o.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }
