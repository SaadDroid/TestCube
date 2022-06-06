@Override
    public boolean isSuccess()
    {
        return mStatusLine.charAt(0x09) == '2';
    }
