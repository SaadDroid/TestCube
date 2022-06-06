public byte[] getBytes() throws IPStringConversionException {
        byte[] out = new byte[4];
        int octet;
        int i;

        if (ip == null) {
            throw new IPStringConversionException("Error ip address is null");
        }

        String ippatternstr = "^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$";
        Pattern ipPattern = Pattern.compile(ippatternstr);
        Matcher ipMatch = ipPattern.matcher(ip);
        if (ipMatch.find()) {
            for (i = 1; i <= 4; i++) {
                try {
                    octet = Integer.parseInt(ipMatch.group(i));
                } catch (NumberFormatException e) {
                    String format = "Error ipv4 octet[%d] is not a valid integer in ip %s";
                    String msg = String.format(format, i, ip);
                    throw new IPStringConversionException(msg);
                }
                if (octet < 0 || octet > 255) {
                    String format = "Error ipv4 octet[%d](%d) is not in range 0 - 255 in ip %s";
                    String msg = String.format(format, i, octet, ip);
                    throw new IPStringConversionException(msg);
                }
                out[i - 1] = BitConverters.int2ubyte((int) (octet % 256));
            }
        } else {
            String err = String.format("Error %s is not a valid IPv4 string", ip);
            throw new IPStringConversionException(err);
        }

        return out;
    }
