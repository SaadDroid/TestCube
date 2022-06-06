public void add(long item,long user,long time)
	{
		if (!mhcs.containsKey(item))
			mhcs.putIfAbsent(item, new MinHashCollection(mhFactory.create(window)));
		MinHashCollection mhc = mhcs.get(item);
		mhc.add(user, time);
	}
