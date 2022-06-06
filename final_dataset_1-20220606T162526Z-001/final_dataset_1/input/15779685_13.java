public static List<Point2d> enrichClosedPolygonalChainByLineCrossing(List<Point2d> openPolygonalChain,
            LinePoints2d splittingLine) {
        return enrichPolygonalChainByLineCrossing(openPolygonalChain, splittingLine, EPSILON, false);
    }
