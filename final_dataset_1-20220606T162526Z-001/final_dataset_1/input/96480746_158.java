@Override
	public List<String> build(String source) {
		if (source == null  || source.isEmpty()) {
			return Collections.emptyList();
		}
		String[] allWords = source.split("[\\s,;:.!()\\?=]");
		List<String> list = new ArrayList<>();
		for (String word: allWords){
			String transformed = transformIfNecessary(word);
			if (transformed!=null && ! transformed.isEmpty()){
				list.add(transformed);
			}
		}
		return list;
	}
