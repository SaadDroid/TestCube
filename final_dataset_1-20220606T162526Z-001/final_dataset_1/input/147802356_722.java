public static BLSSignature empty() {
    return BLSSignature.fromBytesCompressed(Bytes.wrap(new byte[SSZ_BLS_SIGNATURE_SIZE]));
  }
