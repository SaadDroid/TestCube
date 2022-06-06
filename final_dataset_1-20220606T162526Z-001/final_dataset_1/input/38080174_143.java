static void render(long epochSeconds, ByteBuf buf) {
		int pos = render(epochSeconds, buf.array(), buf.tail());
		buf.tail(pos);
	}
