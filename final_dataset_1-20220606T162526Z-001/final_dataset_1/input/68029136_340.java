public T getOrCreateContext(ContextEntity context){
		T c = getContext(context);
		if(c==null){
			c = createContext();
			c.setContext(context);
			addContext(c);
		}
		return c;
	}
