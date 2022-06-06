public static List<Point2d> enrichOpenPolygonalChainByLineCrossing(List<Point2d> openPolygonalChain,
            LinePoints2d splittingLine) {
        return enrichPolygonalChainByLineCrossing(openPolygonalChain, splittingLine, EPSILON, true);
    }
