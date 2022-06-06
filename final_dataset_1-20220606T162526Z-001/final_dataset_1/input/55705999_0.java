public static float calculateRotationDegree(PointF center, PointF p1, PointF p2) {
        double angle1 = Math.atan2(p1.y - center.y, p1.x - center.x);
        double angle2 = Math.atan2(p2.y - center.y, p2.x - center.x);
        float angle = (float) Math.toDegrees(angle2 - angle1);
        if (angle > 180) {
            angle -= 360;
        } else if (angle < -180) {
            angle += 360;
        }
        return angle;
    }
