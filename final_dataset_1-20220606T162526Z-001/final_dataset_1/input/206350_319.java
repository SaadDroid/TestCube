@Override
    public Boolean materializeObject(ResultSet rs, int index, int type) throws Exception {
        boolean b = rs.getBoolean(index);
        return (rs.wasNull()) ? null : b ? Boolean.TRUE : Boolean.FALSE;
    }
