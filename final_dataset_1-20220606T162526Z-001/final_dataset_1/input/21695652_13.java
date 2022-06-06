public void add(String gram) {
        if (name == null || gram == null) return;   // Illegal
        int len = gram.length();
        if (len < 1 || len > NGram.N_GRAM) return;  // Illegal
        ++n_words[len - 1];
        if (freq.containsKey(gram)) {
            freq.put(gram, freq.get(gram) + 1);
        } else {
            freq.put(gram, 1);
        }
    }
