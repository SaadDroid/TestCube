@Override
    public <T> Column<T> getColumn(ColumnKey key) {
        // realtime column不缓存column
        try {
            String name = key.getName();
            String columnId = meta.getColumnId(name);
            IResourceLocation child = location.buildChildLocation(columnId);
            Column<?> column = newColumn(child, ColumnTypeUtils.getClassType(meta.getColumn(name)));
            return (Column<T>) column;
        } catch (SwiftMetaDataColumnAbsentException e) {
            SwiftLoggers.getLogger().error("getColumn failed", e);
            return null;
        } catch (Exception e) {
            SwiftLoggers.getLogger().error("getColumn failed", e);
            return null;
        }
    }
