public String listToCSVString(final List<String> list) {

        final StringBuilder sb = new StringBuilder();

        if (list == null) {
            return sb.toString();
        }

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));

            if (i != list.size() - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
