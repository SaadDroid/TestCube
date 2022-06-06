@Override
    public void check(Collection<? extends T> collection, ConditionEvents events) {
        ConditionEvents subEvents = new ConditionEvents();
        for (T element : collection) {
            condition.check(element, subEvents);
        }
        if (!subEvents.isEmpty()) {
            events.add(new AnyConditionEvent(collection, subEvents));
        }
    }
