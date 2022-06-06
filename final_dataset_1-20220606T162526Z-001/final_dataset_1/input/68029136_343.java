public List<Integer> getContextWithParentIds(ContextEntity context) {
        List<Integer> result = getContextWithParentIdsRec(new ArrayList<Integer>(), context);
        // order has to be swapped at end of recursion
        Collections.reverse(result);
        return result;
    }
