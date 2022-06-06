public static String makeID(String bizCode) {
        if (StringUtils.isBlank(bizCode)
                || bizCode.length() < 2 || bizCode.length() > 8) {
//            throw new RuntimeException(String.format("生成ID失败，参数错误: %s", bizCode));
            throw new RuntimeException(Info.get(IdUtils.class, R.ID_FAILED1, bizCode));
        }
        StringBuilder buf = new StringBuilder(32);
        buf.append(bizCode, 0, bizCode.length())
                .append(DateFormatUtils.format(System.currentTimeMillis(), "yyyyMMddHHmmssSSS"))
                .append(RandomStringUtils.randomAlphabetic(15 - bizCode.length()).toLowerCase());
        return buf.toString();
    }
