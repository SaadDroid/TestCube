public static XmlMessageHeader fromXml(String xml) {
        try {
            XmlMessageHeader xmlRequest = XmlObjectMapper.defaultMapper().fromXml(xml, XmlMessageHeader.class);
            switch (xmlRequest.getMsgType()) {
                case text:
                    return XmlObjectMapper.defaultMapper().fromXml(xml, QyTextRequest.class);
                case image:
                    return XmlObjectMapper.defaultMapper().fromXml(xml, QyImageRequest.class);
                case voice:
                    return XmlObjectMapper.defaultMapper().fromXml(xml, QyVoiceRequest.class);
                case video:
                    return XmlObjectMapper.defaultMapper().fromXml(xml, QyVideoRequest.class);
                case shortvideo:
                    return XmlObjectMapper.defaultMapper().fromXml(xml, QyShortVideoRequest.class);
                case location:
                    return XmlObjectMapper.defaultMapper().fromXml(xml, QyLocationRequest.class);
                case event:
                    return toEvent(xml);
                default:
                    logger.warn("xml to bean failed, unknown message type {}.", xmlRequest.getMsgType());
                    throw new WxRuntimeException(999, "xml to bean failed, unknown message type " + xmlRequest.getMsgType());
            }
        } catch (IOException e) {
            logger.error("xml to message request failed", e);
            throw new WxRuntimeException(999, "xml to message request failed," + e.getMessage());
        }
    }
