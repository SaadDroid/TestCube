public static Map<String,Object> sendMails(Collection<String> receivers, String title, String content,String showType) {
        return sendMails(receivers, null, title, content, showType);
    }
