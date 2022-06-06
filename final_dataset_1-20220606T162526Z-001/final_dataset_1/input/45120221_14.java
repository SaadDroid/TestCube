@Override
	public ResultMessage delete(String ID) {
		try {
			return account.delete(ID);
		} catch (RemoteException e) {
			if (ExceptionHandler.myExceptionHandler(myType, this)) {
				return delete(ID);
			}
		}
		return ResultMessage.FAIL;
	}
