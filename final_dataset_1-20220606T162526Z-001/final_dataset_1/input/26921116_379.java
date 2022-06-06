@Override
    public int getIndegree(int vertex) {
        int degree = 0;

        for (int i = 0; i < n; i++) {
            if (graph[i][vertex] != 0.0) {
                degree++;
            }
        }

        return degree;
    }
