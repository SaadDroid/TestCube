public E set(int index, E val) {
		if (index < 0 || index >= size())
			throw new IndexOutOfBoundsException();
		Node<E> node = root.getNodeAt(index);
		E result = node.value;
		node.value = val;
		return result;
	}
