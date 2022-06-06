public static double approximateDistance(double lat1, double lng1, double lat2, double lng2) {
        double rlat1 = toRadians(lat1);
        double rlat2 = toRadians(lat2);
        double rlng1 = toRadians(lng1);
        double rlng2 = toRadians(lng2);

        double x = (rlng2 - rlng1) * Math.cos((rlat1 + rlat2) / 2);
        double y = (rlat2 - rlat1);
        return Math.sqrt(x * x + y * y) * EARTH_RADIUS_KM;
    }
