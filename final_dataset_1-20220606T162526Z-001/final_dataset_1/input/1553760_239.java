@Override
	public void writeComment(String data) {
		closeElement();
		out.write("<!-- "); //$NON-NLS-1$
		out.write(data);
		out.write(" -->"); //$NON-NLS-1$
	}
