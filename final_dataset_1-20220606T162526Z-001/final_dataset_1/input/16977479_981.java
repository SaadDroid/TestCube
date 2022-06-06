public Integer readUShort() throws CorbaBindingException {
        try {
            int result = stream.read_ushort();
            if (result < 0) {
                result = (result - Short.MIN_VALUE) - Short.MIN_VALUE;
            }
            return result;
        } catch (org.omg.CORBA.MARSHAL ex) {
            LOG.log(Level.SEVERE, "CorbaObjectReader: could not read unsigned short");
            throw new CorbaBindingException("CorbaObjectReader: readUShort MARSHAL exception", ex);
        }
    }
