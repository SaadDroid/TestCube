public String toString(Value v) {
		String result=null;
		if(v instanceof URI) {
			result=writeURI((URI)v);
		} else if(v instanceof BNode) {
			result=writeBNode((BNode)v);
		} else if(v instanceof Literal) {
			result=writeLiteral((Literal)v);
		} else {
			throw new IllegalStateException("Unexpected value type "+v.getClass().getCanonicalName());
		}
		return result;
	}
