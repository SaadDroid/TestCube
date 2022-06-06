@Override
    public void exportGraph(Graph<V, E> g, Writer writer) throws ExportException {
        GraphTests.requireUndirected(g);
        if(format == Format.GRAPH6 && !GraphTests.isSimple(g))
            throw new ExportException("Graphs exported in graph6 format cannot contain loops or multiple edges.");

        //MapOfCity all vertices to a unique integer
        List<V> vertices = new ArrayList<>(g.vertexSet());

        byteArrayOutputStream = new ByteArrayOutputStream();
        currentByte=0;
        bitIndex=0;

        try {
            if (format == Format.SPARSE6)
                writeSparse6(g, vertices);
            else
                writeGraph6(g, vertices);
        }catch (IOException e){
            e.printStackTrace();
        }

        String g6="";
        try {
            g6=byteArrayOutputStream.toString("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        PrintWriter out = new PrintWriter(writer);
        out.print(g6);
        out.flush();
    }
