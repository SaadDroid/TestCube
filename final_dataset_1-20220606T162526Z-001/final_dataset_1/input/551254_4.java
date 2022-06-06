@Override
	public void loadFromStream(InputStream data) throws DataSourceException {
		OdfDocument ods;
		try {
			ods = OdfSpreadsheetDocument.loadDocument(data);
		} catch (Exception e) {
			throw new DataSourceException(
					"Error while reading the ODS data source", e);
		}
		table = ods.getTableList().get(sheetIndex);
		extractFieldNames();
		calculateRowCount();
	}
