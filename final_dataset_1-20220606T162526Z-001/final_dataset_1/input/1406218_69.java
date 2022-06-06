@Override
    public XDOM parse(Reader source) throws ParseException
    {
        Reader pushBackReader = getPushBackReader(source);
        if (pushBackReader != null) {
            return super.parse(pushBackReader);
        } else {
            return new XDOM(Collections.emptyList());
        }
    }
