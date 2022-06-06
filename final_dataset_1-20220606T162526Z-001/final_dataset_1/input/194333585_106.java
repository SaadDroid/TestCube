protected long getOldestTimestamp(Collection<List<Cell>> cellLists) {
        Ordering<List<Cell>> cellListOrdering = new Ordering<List<Cell>>() {
            @Override
            public int compare(List<Cell> left, List<Cell> right) {
                // compare the last element of each list, since that is the smallest in that list
                return Longs.compare(Iterables.getLast(left).getTimestamp(),
                    Iterables.getLast(right).getTimestamp());
            }
        };
        List<Cell> minList = cellListOrdering.min(cellLists);
        return Iterables.getLast(minList).getTimestamp();
    }
