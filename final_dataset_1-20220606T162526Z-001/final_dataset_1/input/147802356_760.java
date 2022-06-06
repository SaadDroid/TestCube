static FP os2ip_modP(Bytes b) {
    return new FP(new DBIGExtended(b.toArray()).mod(P));
  }
