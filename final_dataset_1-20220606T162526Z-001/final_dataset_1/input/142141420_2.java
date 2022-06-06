public void update(String questionId, String body) throws Exception {
		String query = getUpdateStatement();
		Object[] objects = new Object[2];
		objects[0] = body;
		objects[1] = questionId;
		executeQuery(query, objects);
	}
