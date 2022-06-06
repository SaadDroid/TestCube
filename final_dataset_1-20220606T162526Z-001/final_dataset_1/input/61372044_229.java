@DB()
    protected static <M> M getObject(final Class<M> type, final ResultSet rs, final int index) throws SQLException {
        if (type == String.class) {
            final byte[] bytes = rs.getBytes(index);
            if (bytes != null) {
                try {
                    return (M) new String(bytes, "UTF-8");
                } catch (final UnsupportedEncodingException e) {
                    throw new CloudRuntimeException("UnsupportedEncodingException exception while converting UTF-8 data");
                }
            } else {
                return null;
            }
        } else if (type == int.class) {
            return (M) (Integer) rs.getInt(index);
        } else if (type == Integer.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Integer) rs.getInt(index);
            }
        } else if (type == long.class) {
            return (M) (Long) rs.getLong(index);
        } else if (type == Long.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Long) rs.getLong(index);
            }
        } else if (type == Date.class) {
            final Object data = rs.getDate(index);
            if (data == null) {
                return null;
            } else {
                return (M) DateUtil.parseDateString(s_gmtTimeZone, rs.getString(index));
            }
        } else if (type == short.class) {
            return (M) (Short) rs.getShort(index);
        } else if (type == Short.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Short) rs.getShort(index);
            }
        } else if (type == boolean.class) {
            return (M) (Boolean) rs.getBoolean(index);
        } else if (type == Boolean.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Boolean) rs.getBoolean(index);
            }
        } else if (type == float.class) {
            return (M) (Float) rs.getFloat(index);
        } else if (type == Float.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Float) rs.getFloat(index);
            }
        } else if (type == double.class) {
            return (M) (Double) rs.getDouble(index);
        } else if (type == Double.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Double) rs.getDouble(index);
            }
        } else if (type == byte.class) {
            return (M) (Byte) rs.getByte(index);
        } else if (type == Byte.class) {
            if (rs.getObject(index) == null) {
                return null;
            } else {
                return (M) (Byte) rs.getByte(index);
            }
        } else if (type == Calendar.class) {
            final Object data = rs.getDate(index);
            if (data == null) {
                return null;
            } else {
                final Calendar cal = Calendar.getInstance();
                cal.setTime(DateUtil.parseDateString(s_gmtTimeZone, rs.getString(index)));
                return (M) cal;
            }
        } else if (type == byte[].class) {
            return (M) rs.getBytes(index);
        } else {
            return (M) rs.getObject(index);
        }
    }
