public boolean insertDocumentIfNotExists(String word, String synonyms) throws IOException {
        if (searchDocumentByWord(word).totalHits.value == 0) {
            getWriter().addDocument(generateDocument(word, synonyms));
            return true;
        } // else
        error.set(false, Messages.getString("SynonymIndexBuilder.aDocument", word));//$NON-NLS-1$
        return false;
    }
