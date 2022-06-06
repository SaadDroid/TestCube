static String cleanPersonName(String title) {
        title = title.replaceAll("\\s\\([^)]*\\)", "");
        title = title.replaceAll(",?\\s(Jr|Sr)\\.", "");
        return title.trim();
    }
