@Override
    public boolean isInformational()
    {
        return mStatusLine.charAt(0x09) == '1';
    }
