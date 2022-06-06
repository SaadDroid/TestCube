public static IconPackage loadIconPackage(String pathToZip) throws IOException, URISyntaxException {
		if (packageCache.containsKey(pathToZip))
			return packageCache.get(pathToZip);
		Path path = Paths.get(pathToZip);
		URI uri = new URI("jar", path.toUri().toString(), null);

		Map<String, String> env = new HashMap<>();
		env.put("create", "true");

		try (FileSystem fileSystem = FileSystems.newFileSystem(uri, env)) {
			Path iconPath = fileSystem.getPath("icon.png");
			// load main icon
			SDImage icon = IconHelper.loadImage(iconPath);
			// load animation, if exists
			Path animFile = fileSystem.getPath("animation.json");
			// Raw Animation frames, if exists
			AnimationStack animation = null;
			if (Files.exists(animFile)) {
				String text = new String(Files.readAllBytes(animFile), StandardCharsets.UTF_8);
				Gson g = new Gson();
				animation = g.fromJson(text, AnimationStack.class);
				// Load animation frames
				int frameIndex = 0;
				Path frameFile = fileSystem.getPath((frameIndex++) + ".png");
				List<SDImage> frameList = new LinkedList<>();
				List<BufferedImage> rawFrameList = new LinkedList<>();
				while (Files.exists(frameFile)) {
					SDImage frame = IconHelper.loadImage(frameFile);
					frameList.add(frame);
					rawFrameList.add(loadRawImage(frameFile));
					frameFile = fileSystem.getPath((frameIndex++) + ".png");
				}
				SDImage[] frames = new SDImage[frameList.size()];
				for (int i = 0; i < frames.length; i++) {
					frames[i] = frameList.get(i);
				}
				animation.setFrames(frames);
			}
			IconPackage iconPackage = new IconPackage(icon, animation);
			packageCache.put(pathToZip, iconPackage);
			return iconPackage;
		}
	}
