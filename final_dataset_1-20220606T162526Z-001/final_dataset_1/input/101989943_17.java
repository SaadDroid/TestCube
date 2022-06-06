public static SDImage loadImageFromResource(String path) {
		if (imageCache.containsKey(path))
			return imageCache.get(path);
		BufferedImage img = getImageFromResource(path);
		if (img != null) {
			SDImage imgData = convertImage(img); 
			cache(path, imgData);
			return imgData;
		}
		return null;
	}
