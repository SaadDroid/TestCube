@Override
  public boolean equals(@Nullable Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof DeviceGroupDevice)) {
      return false;
    }
    DeviceGroupDevice rhs = (DeviceGroupDevice) obj;
    return _name.equals(rhs._name) && _setSyncLeader == rhs._setSyncLeader;
  }
