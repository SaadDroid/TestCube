@Override
    public void enqueue(final T value) {
        if (size >= array.length) {
            throw new IllegalStateException("Heap is already full.");
        }

        // put element to the end of the array
        array[size] = value;
        // fix the heap starting from the last element added
        fixHeapBottomUp(size);
        // increment the heap size
        size++;
    }
