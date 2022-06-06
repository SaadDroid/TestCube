public static String getSupportedImageTypes() {
        String[] readers = ImageIO.getReaderFormatNames();
        ArrayList<String> imageArray = new ArrayList<String>();
        String str = "";
        for (int i = 0; i < readers.length; i++) {
            String current = readers[i].toLowerCase();
            if (!imageArray.contains(current)) {
                imageArray.add(current);
                str += current + ",";
            }
        }
        return str.substring(0, str.lastIndexOf(","));
    }
