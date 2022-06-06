public static BigDecimal getAmountInBytes(Quantity quantity) throws ArithmeticException {
    String value = "";
    if (quantity.getAmount() != null && quantity.getFormat() != null) {
      value = quantity.getAmount() + quantity.getFormat();
    } else if (quantity.getAmount() != null) {
      value = quantity.getAmount();
    }

    if (value == null || value.isEmpty()) {
      throw new IllegalArgumentException("Invalid quantity value passed to parse");
    }
    // Append Extra zeroes if starting with decimal
    if (!Character.isDigit(value.indexOf(0)) && value.startsWith(".")) {
        value = "0" + value;
    }

    Quantity amountFormatPair = parse(value);
    String formatStr = amountFormatPair.getFormat();
    // Handle Decimal exponent case
    if ((formatStr.matches(AT_LEAST_ONE_DIGIT_REGEX)) && formatStr.length() > 1) {
      int exponent = Integer.parseInt(formatStr.substring(1));
      return new BigDecimal("10").pow(exponent, MathContext.DECIMAL64).multiply(new BigDecimal(amountFormatPair.getAmount()));
    }

    BigDecimal digit = new BigDecimal(amountFormatPair.getAmount());
    BigDecimal multiple = new BigDecimal("1");
    BigDecimal binaryFactor = new BigDecimal("2");
    BigDecimal decimalFactor = new BigDecimal("10");

    switch (formatStr) {
      case "Ki":
        multiple = binaryFactor.pow(10, MathContext.DECIMAL64);
        break;
      case "Mi":
        multiple = binaryFactor.pow(20, MathContext.DECIMAL64);
        break;
      case "Gi":
        multiple = binaryFactor.pow(30, MathContext.DECIMAL64);
        break;
      case "Ti":
        multiple = binaryFactor.pow(40, MathContext.DECIMAL64);
        break;
      case "Pi":
        multiple = binaryFactor.pow(50, MathContext.DECIMAL64);
        break;
      case "Ei":
        multiple = binaryFactor.pow(60, MathContext.DECIMAL64);
        break;
      case "n":
        multiple = decimalFactor.pow(-9, MathContext.DECIMAL64);
        break;
      case "u":
        multiple = decimalFactor.pow(-6, MathContext.DECIMAL64);
        break;
      case "m":
        multiple = decimalFactor.pow(-3, MathContext.DECIMAL64);
        break;
      case "k":
        multiple = decimalFactor.pow(3, MathContext.DECIMAL64);
        break;
      case "M":
        multiple = decimalFactor.pow(6, MathContext.DECIMAL64);
        break;
      case "G":
        multiple = decimalFactor.pow(9, MathContext.DECIMAL64);
        break;
      case "T":
        multiple = decimalFactor.pow(12, MathContext.DECIMAL64);
        break;
      case "P":
        multiple = decimalFactor.pow(15, MathContext.DECIMAL64);
        break;
      case "E":
        multiple = decimalFactor.pow(18, MathContext.DECIMAL64);
        break;
    }

    return digit.multiply(multiple);
  }
