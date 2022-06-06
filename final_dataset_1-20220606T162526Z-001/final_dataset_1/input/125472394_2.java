public static String extractBytePacketValueFromString(final String packetName, final String s) {

        if (packetName == null) {
            return EmptyString;
        }

        JsonParser jp = new JsonParser();
        JsonElement je = null;
        try {
            je = jp.parse(s);
        }catch (Exception e) {
            Logger logger = LoggerFactory.getLogger("com.nhnent.eat.common.Util");
            logger.error("packetName:{}\n, json:\n{}\n", packetName, s);
            logger.error(ExceptionUtils.getStackTrace(e));
        }

        JsonElement foundElement= getValueOfVar(je, packetName);
        if(foundElement != null) {
            return foundElement.toString();
        } else {
            return EmptyString;
        }
    }
