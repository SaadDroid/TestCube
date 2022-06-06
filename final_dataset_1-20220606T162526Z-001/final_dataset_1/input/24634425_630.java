public List<Pivot> smartGenerate(List<T> staticPart, 
			List<T> pivots, LinkedList<LinkedList<T>> variations){
		Logger.getLogger("Generator").info("begin smartgenerating ...");
		List<Pivot> result = new ArrayList<>();
		LinkedList<LinkedList<T>> suffixes = generate(variations);
		Logger.getLogger("Generator").info("number of variations in suffixes : "+suffixes.size());
		for(T pivot : pivots){
			Logger.getLogger("Generator").info("considering pivot:"+pivot.toString());
			List<T> entry = new ArrayList<>();
			entry.addAll(staticPart);
			entry.add(pivot);
			Pivot p = new Pivot();
			p.prefix=entry;
			p.suffixes=suffixes;
			result.add(p);
		}
		
		return result;
	}
