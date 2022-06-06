@Override
	public int getDayDocCount(DocType type , MyDate date) throws RemoteException {
		switch (type) {
		case inStoreDoc:
			return super.getDayDocCount(instoreDocTable ,date);
		case outStoreDoc:
			return super.getDayDocCount(outstoreDocTable, date);
		default:
			break;
		}
		System.err.println("单据类型错误，不能获得对应单据");
		return -1;
	}
