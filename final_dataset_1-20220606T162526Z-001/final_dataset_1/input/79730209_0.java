boolean merge(WeightedList<E> list)
    {
        for (Integer oldKey : list.map.keySet())
            map.put(maxValue + oldKey, list.map.get(oldKey));
        maxValue += list.maxValue;

        return true;
    }
