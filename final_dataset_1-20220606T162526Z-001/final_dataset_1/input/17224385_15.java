@Override
    public String getColumnName(final int columnIndex) {
        if (columnIndex >= getColumnCount()) {
            throw new IdropRuntimeException("column unavailable, out of bounds");
        }

		// translate indexes to object values
		// 0 = attribute
        if (columnIndex == 0) {
            return "Attribute";
        }

		// 1 = value
        if (columnIndex == 1) {
            return "Value";
        }

		// 2 = units
        if (columnIndex == 2) {
            return "Unit";
        }

        throw new IdropRuntimeException("unknown column");
    }
