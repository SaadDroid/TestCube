public void increment(int foundIndex) {
        //increment the frequency
        int newFrequency = get(foundIndex).getRight() + 1;
        get(foundIndex).setRight(newFrequency);

        //Find the index where the value should be
        int currentIndex = foundIndex - 1;
        while (currentIndex >= 0 && get(currentIndex).getRight() < newFrequency)
            currentIndex--;

        //Move the value to the right index
        //Use swap is ok since the swapped frequency difference is always 1
        if (currentIndex + 1 != foundIndex)
            Collections.swap(this, currentIndex + 1, foundIndex);
    }
