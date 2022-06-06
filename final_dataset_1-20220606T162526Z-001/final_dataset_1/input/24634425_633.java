public LinkedList<LinkedList<T>> generate(LinkedList<LinkedList<T>> axes){
		Logger.getLogger("Generator").info("start variation generator for axes : "+axes.size());
		if(axes.isEmpty()){
			return new LinkedList<>();
		}
		
		LinkedList<LinkedList<T>> result = new LinkedList<>();
		
		List<T> axe = axes.removeFirst();
		LinkedList<LinkedList<T>> subs = generate(axes);
		
		if(subs.isEmpty()){
			for(T item : axe){
				result.add(new LinkedList<T>(){{add(item);}});
			}
			return result;
		}
		
		for(T item : axe){
			Logger.getLogger("Generator").info("considering axe item "+ item);
			for(LinkedList<T> sub:subs){
				LinkedList<T> clone = new LinkedList<>(sub);
				clone.addFirst(item);
				result.add(clone);
			}
		}
		
		return result;
	}
