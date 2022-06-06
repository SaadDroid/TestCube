@JsonIgnore
    public void sortLoas() {
        Collections.sort(this.loas, Comparator.comparing(LoA::getLevel).reversed());
    }
