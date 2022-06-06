public List<Article> findByDescription(String start)
	{
		return table.stream().filter(a -> a.getDescription().startsWith(start)).collect(Collectors.toList());
	}
