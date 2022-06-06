public static Map<Generator, Object> valuesForCurrentIteration() {
		Context c = CONTEXT.get();
		if(c == null)
			throw newUninitializedException();

		Map<Generator, Object> res = new HashMap<>();
		if(c.iterations != null && !c.iterations.isEmpty())
			for(Map.Entry<Generator, Iteration> variable : c.iterations.peek().entrySet()) {
				Iteration i = variable.getValue();
				if(i.generated)
					res.put(variable.getKey(), i.getCurrent());
			}

		return res;
	}
