public static SplitResult split(List<Point2d> polygon, LinePoints2d splittingLine) {
        return split(polygon, splittingLine, EPSILON);
    }
