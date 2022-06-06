public static RuntimeDelegate getInstance() {
		RuntimeDelegate result = RuntimeDelegate.CACHED_DELEGATE.get();
		if (result != null) {
			return result;
		}
		synchronized(RuntimeDelegate.CACHED_DELEGATE) {
			result=RuntimeDelegate.CACHED_DELEGATE.get();
			if(result==null) {
				result=findDelegate();
				if(result==null) {
					result=new DefaultRuntimeDelegate();
				}
				RuntimeDelegate.CACHED_DELEGATE.set(result);
			}
			return result;
		}
	}
