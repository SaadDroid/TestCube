@Override
    public String hash(final IStacktrace st) throws StacktraceHashException {
        return hashString(st.getStacktraceText());
    }
