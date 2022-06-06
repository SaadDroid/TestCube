public static boolean IP6RegEx(String ip) {
        return ipv6Pattern.matcher(ip).matches();
    }
