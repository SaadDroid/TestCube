public static String normalizePhoneNumber(String phoneNumber) {
    if (phoneNumber == null)
      return phoneNumber;
    phoneNumber = phoneNumber.replaceAll("[^\\w]", "");
    phoneNumber.replaceAll("_", "");
    if (phoneNumber.length() == 10)
      phoneNumber = "1" + phoneNumber;
    return phoneNumber;
  }
