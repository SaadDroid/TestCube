public static Address fromBase58(@Nullable NetworkParameters params, String base58)
            throws AddressFormatException, AddressFormatException.WrongNetwork {
        byte[] versionAndDataBytes = Base58.decodeChecked(base58);
        int version = versionAndDataBytes[0] & 0xFF;
        byte[] bytes = Arrays.copyOfRange(versionAndDataBytes, 1, versionAndDataBytes.length);
        if (params == null) {
            for (NetworkParameters p : Networks.get()) {
                if (version == p.getAddressHeader())
                    return new Address(p, false, bytes);
                else if (version == p.getP2SHHeader())
                    return new Address(p, true, bytes);
            }
            throw new AddressFormatException.InvalidPrefix("No network found for " + base58);
        } else {
            if (version == params.getAddressHeader())
                return new Address(params, false, bytes);
            else if (version == params.getP2SHHeader())
                return new Address(params, true, bytes);
            throw new AddressFormatException.WrongNetwork(version);
        }
    }
