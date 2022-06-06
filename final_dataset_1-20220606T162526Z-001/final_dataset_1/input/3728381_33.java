@Override
	public byte[] next() {
		byte[] buffer = new byte[Math.min(data.length - offset, maxFragmentSize)];
		System.arraycopy(data, offset, buffer, 0, buffer.length);
		offset += buffer.length;
		return buffer;
	}
