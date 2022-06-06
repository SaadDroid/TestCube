public WordNetVersionAlignment(URL url)
		throws IOException
	{
	    InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		map = TreeMultimap.create(Ordering.natural(), new CompareSecond());
		String line;

		while ((line = br.readLine()) != null) {
			Scanner s = new Scanner(line);
			s.useLocale(new Locale("en", "us"));
			Integer source = s.nextInt();
			while (s.hasNextInt()) {
				Integer target = s.nextInt();
				Double weight = s.nextDouble();
				map.put(source, new Pair<Integer, Double>(target, weight));
			}
			s.close();
		}

		br.close();
		is.close();
	}
