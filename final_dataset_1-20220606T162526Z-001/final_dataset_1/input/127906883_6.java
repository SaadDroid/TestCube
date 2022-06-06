public static Object string2col(String str, String type, SimpleDateFormat customTimeFormat) {
        if(str == null || str.length() == 0 || type == null){
            return str;
        }

        ColumnType columnType = ColumnType.getType(type.toUpperCase());
        Object ret;
        switch(columnType) {
            case TINYINT:
                ret = Byte.valueOf(str.trim());
                break;
            case SMALLINT:
                ret = Short.valueOf(str.trim());
                break;
            case INT:
                ret = Integer.valueOf(str.trim());
                break;
            case MEDIUMINT:
            case BIGINT:
                ret = Long.valueOf(str.trim());
                break;
            case FLOAT:
                ret = Float.valueOf(str.trim());
                break;
            case DOUBLE:
                ret = Double.valueOf(str.trim());
                break;
            case STRING:
            case VARCHAR:
            case CHAR:
                if(customTimeFormat != null){
                    ret = DateUtil.columnToDate(str,customTimeFormat);
                    ret = DateUtil.timestampToString((Date)ret);
                } else {
                    ret = str;
                }
                break;
            case BOOLEAN:
                ret = Boolean.valueOf(str.trim().toLowerCase());
                break;
            case DATE:
                ret = DateUtil.columnToDate(str,customTimeFormat);
                break;
            case TIMESTAMP:
            case DATETIME:
                ret = DateUtil.columnToTimestamp(str,customTimeFormat);
                break;
            default:
                ret = str;
        }

        return ret;
    }
