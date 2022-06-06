@Override
  public AttributeSet extract(String s) {
    if (s == null || s.isEmpty()) {
      return new AttributeSet();
    }

    HasMetadata h = toKubernetesResource(s);
    if (h != null) {
      return extract(h);
    }

    return fromPath(s);
  }
