public void writeShort(Short s) throws CorbaBindingException {
        if (s == null) {
            stream.write_short((short)0);
        } else {
            stream.write_short(s.shortValue());
        }
    }
