public void setQueryTokenizer(IQueryTokenizer aTokenizer) {
        if (aTokenizer == null) {
            throw new IllegalArgumentException("aTokenizer arg cannot be null");
        }        
        if (customTokenizerInstalled) {
            String currentTokenizer = tokenizer.getClass().getName();
            String newTokenizer = tokenizer.getClass().getName();
            throw new IllegalStateException(
                "Only one custom query tokenizer can be installed.  " +
                "Current tokenizer is "+currentTokenizer+". New tokenizer is "+
                newTokenizer);
        }
        customTokenizerInstalled = true;
        tokenizer = aTokenizer;

       TokenizerSessPropsInteractions tep = tokenizer.getTokenizerSessPropsInteractions();

       if(tep.isTokenizerDefinesStatementSeparator())
       {
         _props.setSQLStatementSeparator(aTokenizer.getSQLStatementSeparator());
       }

       if(tep.isTokenizerDefinesStatementSeparator())
       {
          _props.setStartOfLineComment(aTokenizer.getLineCommentBegin());
       }

       if(tep.isTokenizerDefinesStatementSeparator())
       {
         _props.setRemoveMultiLineComment(aTokenizer.isRemoveMultiLineComment());
       }
    }
