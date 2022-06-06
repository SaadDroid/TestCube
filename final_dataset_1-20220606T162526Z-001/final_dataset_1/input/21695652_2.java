public void add(String line) {
        if (tag_ == target_ && line != null) {
            buf_.append(line);
        }
    }
