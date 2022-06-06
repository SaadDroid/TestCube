public static @Nonnull BDD pickRepresentative(BDD bdd, List<BDD> preference) {
    if (bdd.isZero()) {
      return bdd;
    }

    BDD curBDD = bdd.id(); // clone so we can free.
    for (BDD preferredBDD : preference) {
      BDD newBDD = preferredBDD.and(curBDD);
      if (newBDD.isZero()) {
        continue;
      }
      curBDD.free();
      curBDD = newBDD;
    }

    return curBDD.satOne();
  }
