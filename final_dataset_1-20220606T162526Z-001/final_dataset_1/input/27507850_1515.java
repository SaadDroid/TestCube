@Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    VarInt other = (VarInt) obj;
    if (_var == null) {
      if (other._var != null) {
        return false;
      }
    } else if (!_var.equals(other._var)) {
      return false;
    }
    return true;
  }
