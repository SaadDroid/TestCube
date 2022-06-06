public static VendorSpecificInformationOption create(@Nonnull final int enterpriseNumber, @Nonnull final Dhcp6Options options) {
        final VendorSpecificInformationOption iaNaOption = new VendorSpecificInformationOption();
        int length = HEADER_SIZE;

        ByteBuffer encodedOptions = null;
        if (!options.isEmpty()) {
            encodedOptions = Dhcp6MessageEncoder.getInstance().encode(options);
            length += encodedOptions.limit();
        }

        iaNaOption.setData(new byte[length]);
        iaNaOption.setEnterpriseNumber(enterpriseNumber);
        if (encodedOptions != null) {
            iaNaOption.setOptions(encodedOptions);
        }
        return iaNaOption;
    }
