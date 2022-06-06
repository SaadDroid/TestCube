@Override
    public Object transform(Object message) {
        return _dozerBeanMapper.map(message, QNameUtil.toJavaMessageType(getTo()));
    }
