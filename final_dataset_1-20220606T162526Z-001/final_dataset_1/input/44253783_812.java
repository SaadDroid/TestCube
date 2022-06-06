public <T extends JdbcMapInsert> T withColumnBookend(Character c) {
    setColumnBookendCharacter(c);
    return (T) this;
  }
