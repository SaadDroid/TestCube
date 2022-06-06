@Override
    public boolean exists(ID subject, UID predicate, NODE object, UID context, boolean includeInferred) {
        STMTIterator stmts = findStatements(subject, predicate, object, context, includeInferred, true);
        try {
            return stmts.hasNext();
        } finally {
            stmts.close();
        }
    }
