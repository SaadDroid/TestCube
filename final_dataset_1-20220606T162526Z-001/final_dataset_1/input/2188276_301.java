public synchronized void setTableInfo(ITableInfo ti)
	{
		if (ti != null)
		{
			load(ti);
		}
		else
		{
			for (int i = 0; i < _data.length; ++i)
			{
				_data[i][1] = "";
			}
		}
	}
