public static boolean verify(
      MikuliPublicKey publicKey, Bytes message, MikuliSignature signature) {
    return coreVerify(publicKey, message, signature);
  }
