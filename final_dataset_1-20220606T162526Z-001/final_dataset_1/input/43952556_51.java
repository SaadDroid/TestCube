@Override
    public GroupData getGroupData(InMemoryGroup group) {
        Collection<EntryData> data = this.entries.computeIfAbsent(group.getName(), __ -> new ArrayList<>(group.initialData()));
        return new TransientGroupData(group, data);
    }
