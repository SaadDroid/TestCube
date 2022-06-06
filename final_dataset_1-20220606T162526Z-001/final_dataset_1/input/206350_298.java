@Override
    public boolean equals(Object o) {
        if (!(o instanceof ColumnDescriptor)) {
            return false;
        }

        ColumnDescriptor rhs = (ColumnDescriptor) o;
        return new EqualsBuilder().append(name, rhs.name).append(namePrefix, rhs.namePrefix)
                .append(procedureName, rhs.procedureName).append(dataRowKey, rhs.dataRowKey)
                .append(tableName, rhs.tableName).isEquals();
    }
