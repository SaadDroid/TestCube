@VisibleForTesting
  static InputValidationNotes validateIp(String query) {
    try {
      Ip ip = Ip.parse(query);
      return new InputValidationNotes(Validity.VALID, ip.toString());
    } catch (Exception e) {
      return new InputValidationNotes(Validity.INVALID, e.getMessage());
    }
  }
