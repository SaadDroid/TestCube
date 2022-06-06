@Deprecated
    public static <V extends Comparable<V>> Map<String, V> sortByStringKeyLength(Map<String, V> map, final Order order) {

        LinkedList<Entry<String, V>> list = new LinkedList<>(map.entrySet());

        Comparator<Entry<String, V>> comparator = (o1, o2) -> {
            int ret = new Integer(o1.getKey().length()).compareTo(o2.getKey().length());
            return order == Order.ASCENDING ? ret : -ret;
        };
        Collections.sort(list, comparator);

        Map<String, V> result = new LinkedHashMap<>();
        for (Entry<String, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
