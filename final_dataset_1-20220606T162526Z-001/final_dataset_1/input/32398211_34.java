public Query invertQuery(
            @DescribeParameter(name = "outputBBOX", description = "Georeferenced bounding box of the output") ReferencedEnvelope envelope,
            Query targetQuery, GridGeometry targetGridGeometry
            ) throws ProcessException {

        final BBOXRemovingFilterVisitor visitor = new BBOXRemovingFilterVisitor();
        Filter filter = (Filter) targetQuery.getFilter().accept(visitor, null);
        final String geometryName = visitor.getGeometryPropertyName();
        if (geometryName != null) {
            final BBOX bbox;
            try {
                if (envelope.getCoordinateReferenceSystem() != null) {
                    envelope = envelope.transform(DefaultGeographicCRS.WGS84,false);
                }
                bbox = FILTER_FACTORY.bbox(geometryName, envelope.getMinX(), envelope.getMinY(), envelope.getMaxX(), envelope.getMaxY(),  "EPSG:4326");
            } catch (Exception e) {
                throw new ProcessException("Unable to create bbox filter for feature source", e);
            }
            filter = (Filter) FILTER_FACTORY.and(filter, bbox).accept(new SimplifyingFilterVisitor(), null);
            targetQuery.setFilter(filter);
        }

        final List<PropertyName> properties = new ArrayList<>();
        properties.add(FILTER_FACTORY.property("_aggregation"));
        targetQuery.setProperties(properties);
        return targetQuery;
    }
