public void initializeAttachments() throws IOException {
        initializeRootMessage();

        Object maxCountProperty = message.getContextualProperty(AttachmentDeserializer.ATTACHMENT_MAX_COUNT);
        int maxCount = 50;
        if (maxCountProperty != null) {
            if (maxCountProperty instanceof Integer) {
                maxCount = (Integer)maxCountProperty;
            } else {
                maxCount = Integer.parseInt((String)maxCountProperty);
            }
        }

        attachments = new LazyAttachmentCollection(this, maxCount);
        message.setAttachments(attachments);
    }
