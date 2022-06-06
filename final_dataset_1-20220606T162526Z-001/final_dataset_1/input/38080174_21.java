public static <I, O> StreamTransducer<I, O> create(Transducer<I, O, ?> transducer) {
		return new StreamTransducer<>(transducer);
	}
