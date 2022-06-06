public static String getSoapAction(Message m) {
        if (!(m instanceof SoapMessage)) {
            return null;
        }
        SoapMessage message = (SoapMessage)m;
        if (message.getVersion() instanceof Soap11) {
            Map<String, List<String>> headers
                = CastUtils.cast((Map<?, ?>)message.get(Message.PROTOCOL_HEADERS));
            if (headers != null) {
                List<String> sa = headers.get(SoapBindingConstants.SOAP_ACTION);
                if (sa != null && !sa.isEmpty()) {
                    String action = sa.get(0);
                    if (action.startsWith("\"") || action.startsWith("\'")) {
                        action = action.substring(1, action.length() - 1);
                    }
                    return action;
                }
            }
        } else if (message.getVersion() instanceof Soap12) {
            String ct = (String) message.get(Message.CONTENT_TYPE);

            if (ct == null) {
                return null;
            }

            int start = ct.indexOf("action=");
            if (start == -1 && ct.indexOf("multipart/related") == 0 && ct.indexOf("start-info") == -1) {
                // the action property may not be found at the package's content-type for non-mtom multipart message
                // but skip searching if the start-info property is set
                List<String> cts = CastUtils.cast((List<?>)(((Map<?, ?>)
                    message.get(AttachmentDeserializer.ATTACHMENT_PART_HEADERS)).get(Message.CONTENT_TYPE)));
                if (cts != null && !cts.isEmpty()) {
                    ct = cts.get(0);
                    start = ct.indexOf("action=");
                }
            }
            if (start != -1) {
                int end;
                char c = ct.charAt(start + 7);
                // handle the extraction robustly
                if (c == '\"') {
                    start += 8;
                    end = ct.indexOf('\"', start);
                } else if (c == '\\' && ct.charAt(start + 8) == '\"') {
                    start += 9;
                    end = ct.indexOf('\\', start);
                } else {
                    start += 7;
                    end = ct.indexOf(';', start);
                    if (end == -1) {
                        end = ct.length();
                    }
                }
                return ct.substring(start, end);
            }
        }

        // Return the Soap Action for the JMS Case
        if (message.containsKey(SoapJMSInInterceptor.JMS_SOAP_ACTION_VALUE)) {
            return (String)message.get(SoapJMSInInterceptor.JMS_SOAP_ACTION_VALUE);
        }

        return null;
    }
