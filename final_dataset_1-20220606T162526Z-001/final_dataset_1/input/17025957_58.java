@Override
    public Iterable<Row> query(String query, Object... params) {
        if (this.iterable == null) {
            try {
                this.iterable = this.load();
            } catch (ScriptException | IOException ex) {
                Logger.getLogger(ScriptableSource.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.iterable;
    }
