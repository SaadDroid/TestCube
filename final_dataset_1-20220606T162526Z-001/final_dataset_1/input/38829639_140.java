public Map<String, Object> delete(String namespace) {
    return makeCall(fetchUrl(namespace, null, null), null, HttpCallMethod.DELETE);
  }
