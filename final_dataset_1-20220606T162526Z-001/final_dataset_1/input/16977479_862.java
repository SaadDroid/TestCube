public static void encodeRMContent(RMMessage rmmsg, Message msg, InputStream msgContent)
        throws IOException {
        CachedOutputStream cos = new CachedOutputStream();
        if (msg.getAttachments() == null) {
            rmmsg.setContentType((String)msg.get(Message.CONTENT_TYPE));
            IOUtils.copyAndCloseInput(msgContent, cos);
            cos.flush();
            rmmsg.setContent(cos);
        } else {
            MessageImpl msgImpl1 = new MessageImpl();
            msgImpl1.setContent(OutputStream.class, cos);
            msgImpl1.setAttachments(msg.getAttachments());
            msgImpl1.put(Message.CONTENT_TYPE, msg.get(Message.CONTENT_TYPE));
            msgImpl1.setContent(InputStream.class, msgContent);
            AttachmentSerializer serializer = new AttachmentSerializer(msgImpl1);
            serializer.setXop(false);
            serializer.writeProlog();
            // write soap root message into cached output stream
            IOUtils.copyAndCloseInput(msgContent, cos);
            cos.flush();
            serializer.writeAttachments();
            rmmsg.setContentType((String) msgImpl1.get(Message.CONTENT_TYPE));
            rmmsg.setContent(cos);
        }
    }
