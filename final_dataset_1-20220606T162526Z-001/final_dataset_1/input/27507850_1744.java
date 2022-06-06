@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TcpApplication)) {
      return false;
    }
    TcpApplication that = (TcpApplication) o;
    return Objects.equals(_ports, that._ports);
  }
