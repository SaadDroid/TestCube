@Nonnull
    @Override
    public Iterator<String[]> iterator() {
        return contrastDetails.stream().map(list -> list.toArray(new String[0])).iterator();
    }
