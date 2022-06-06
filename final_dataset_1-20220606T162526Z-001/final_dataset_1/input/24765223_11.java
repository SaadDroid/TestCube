public List<T> subListByKey(K key, int fromIndex, int toIndex) {
        LinkedList<T> typedList = typedLists.get(key);
        if (typedList == null)
            return Collections.EMPTY_LIST;

        return typedList.subList(fromIndex, toIndex);
    }
