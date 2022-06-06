public List<String> asList() {
        List<String> list = new ArrayList<>();
        String       next;
        while ((next = next()) != null)
            list.add(next);

        return list;
    }
