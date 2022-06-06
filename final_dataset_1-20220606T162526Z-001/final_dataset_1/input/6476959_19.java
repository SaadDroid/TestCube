@Override
	public boolean removeLastOccurrence(Object o)
	{
		if (o == null)
			throw new NullPointerException();
		Iterator<T> i = descendingIterator();
		while (i.hasNext())
		{
			if (o.equals(i.next()))
			{
				i.remove();
				return true;
			}
		}
		return false;
	}
