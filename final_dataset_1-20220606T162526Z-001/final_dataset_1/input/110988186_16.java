@Override
    public void importGraph(Graph<V, E> graph, Reader input)
        throws ImportException
    {
        try {
            ThrowingErrorListener errorListener = new ThrowingErrorListener();

            // create lexer
            GmlLexer lexer = new GmlLexer(new ANTLRInputStream(input));
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);

            // create parser
            GmlParser parser = new GmlParser(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Specify our entry point
            GmlContext graphContext = parser.gml();

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            CreateGraphGmlListener listener = new CreateGraphGmlListener();
            walker.walk(listener, graphContext);

            // update graph
            listener.updateGraph(graph);
        } catch (IOException e) {
            throw new ImportException("Failed to import gml graph: " + e.getMessage(), e);
        } catch (ParseCancellationException pe) {
            throw new ImportException("Failed to import gml graph: " + pe.getMessage(), pe);
        } catch (IllegalArgumentException iae) {
            throw new ImportException("Failed to import gml graph: " + iae.getMessage(), iae);
        }
    }
