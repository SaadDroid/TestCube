static ToDoTask create(String description, int dueInDays) {
		ToDoTask task = new ToDoTask();
		task.setDescription(description);
		task.setDue(LocalDate.now().plusDays(dueInDays));

		return task;
	}
