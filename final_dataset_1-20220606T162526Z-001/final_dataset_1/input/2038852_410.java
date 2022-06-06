public static String escape_html(String html) {
        StringBuilder sb = new StringBuilder();
        char ch;
        int len = html.length();
        int i;
        for (i = 0; i < len; i++) {
            ch = html.charAt(i);
            switch (ch) {
                case ' ':
                    sb.append("&nbsp;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '"':
                    sb.append("&quot;");
                    break;
                case '&':
                    sb.append("&amp;");
                    break;
                case '\n':
                    sb.append("<br/>");
                    break;
                default:
                    sb.append(ch);
                    break;
            }
        }
        return sb.toString();
    }
