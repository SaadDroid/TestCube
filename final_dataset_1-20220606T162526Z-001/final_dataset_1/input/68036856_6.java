public Banana findOne(Long id) {
    if(Objects.isNull(id)) {
      return null;
    }

    return bananas
            .stream()
            .filter(b -> id.equals(b.getId()))
            .findFirst()
            .orElse(null);
  }
