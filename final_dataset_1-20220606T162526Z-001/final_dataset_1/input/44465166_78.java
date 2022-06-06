public synchronized boolean existsEntry(String word, POS pos) throws JWNLException {
        return getIndexWord(pos, word) != null;
    }
