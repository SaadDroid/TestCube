public void writeSequence(CorbaObjectHandler obj) throws CorbaBindingException {
        if (obj instanceof CorbaOctetSequenceHandler) {
            byte[] value = ((CorbaOctetSequenceHandler) obj).getValue();
            stream.write_ulong(value.length);
            stream.write_octet_array(value, 0, value.length);
        } else {
            CorbaSequenceHandler seqHandler = (CorbaSequenceHandler)obj;
            List<CorbaObjectHandler> seqElements = seqHandler.getElements();
            int length = seqElements.size();
            stream.write_ulong(length);
            for (int i = 0; i < length; ++i) {
                this.write(seqElements.get(i));
            }
        }
    }
