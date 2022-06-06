public static void setPhases(SortedSet<Phase> list, String start, String end) {
        Phase startPhase = new Phase(start, 1);
        Phase endPhase = new Phase(end, 2);
        Iterator<Phase> iter = list.iterator();
        boolean remove = true;
        while (iter.hasNext()) {
            Phase p = iter.next();
            if (remove
                && p.getName().equals(startPhase.getName())) {
                remove = false;
            } else if (p.getName().equals(endPhase.getName())) {
                remove = true;
            } else if (remove) {
                iter.remove();
            }
        }
    }
