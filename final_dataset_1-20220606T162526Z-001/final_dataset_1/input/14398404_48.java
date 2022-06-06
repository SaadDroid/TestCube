public static String template(String arg, String p, String index, String m) {
        StringTemplate template = new StringTemplate(arg);
        template.setAttribute("pid", p);
        template.setAttribute("index", index);
        template.setAttribute("model", m);
        return template.toString();
    }
