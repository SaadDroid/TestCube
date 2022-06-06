public static IntersectPoints intersectRays2d(Ray2d r1, Ray2d r2) {

        Point2d s1p0 = r1.A;
        Point2d s1p1 = new Point2d(r1.A);
        s1p1.add(r1.U);

        Point2d s2p0 = r2.A;
        Point2d s2p1 = new Point2d(r2.A);
        s2p1.add(r2.U);

        Vector2d u = r1.U;
        Vector2d v = r2.U;

        Vector2d w = new Vector2d();
        w.sub(s1p0, s2p0);

        double d = perp(u, v);

        // test if they are parallel (includes either being a point)
        if (Math.abs(d) < SMALL_NUM) { // S1 and S2 are parallel
            if (perp(u, w) != 0 || perp(v, w) != 0) {
                // return 0;
                // they are NOT collinear
                return EMPTY;
            }
            // they are collinear or degenerate
            // check if they are degenerate points
            double du = dot(u, u);
            double dv = dot(v, v);
            if (du == 0 && dv == 0) {
                // both segments are points
                if (s1p0 != s2p0) {

                    // return 0;
                    return EMPTY;
                }
                Point2d I0 = s1p0;
                // they are the same point
                // return 1;
                return new IntersectPoints(I0);
            }
            if (du == 0) {
                // S1 is a single point
                if (!inCollinearRay(s1p0, s2p0, v)) {
                    // return 0;
                    return EMPTY;
                }
                Point2d I0 = s1p0;
                // return 1;
                return new IntersectPoints(I0);
            }
            if (dv == 0) {
                // S2 a single point
                if (!inCollinearRay(s2p0, s1p0, u)) {
                    // return 0;
                    return EMPTY;
                }
                Point2d I0 = s2p0;
                // return 1;
                return new IntersectPoints(I0);
            }
            // they are collinear segments - get overlap (or not)
            double t0, t1;
            // endpoints of S1 in eqn for S2
            Vector2d w2 = new Vector2d();
            w2.sub(s1p1, s2p0);
            if (v.x != 0) {
                t0 = w.x / v.x;
                t1 = w2.x / v.x;
            } else {
                t0 = w.y / v.y;
                t1 = w2.y / v.y;
            }
            if (t0 > t1) {
                // must have t0 smaller than t1
                double t = t0;
                t0 = t1;
                t1 = t; // swap if not
            }
            if (/*t0 > 1 ||*/ t1 < 0) {
                // return 0; // NO overlap
                return EMPTY;
            }

            // clip to min 0
            t0 = t0 < 0 ? 0 : t0;
            // clip to max 1
            //t1 = t1 > 1 ? 1 : t1;

            if (t0 == t1) {
                // intersect is a point

                // I0 = S2_P0 + t0 * v;
                Point2d I0 = new Point2d(v);
                I0.scale(t0);
                I0.add(s2p0);

                // return 1;
                return new IntersectPoints(I0);
            }

            // they overlap in a valid subsegment

            // I0 = S2_P0 + t0 * v;
            Point2d I0 = new Point2d(v);
            I0.scale(t0);
            I0.add(s2p0);

            // I1 = S2_P0 + t1 * v;
            Point2d I1 = new Point2d(v);
            I1.scale(t1);
            I1.add(s2p0);

            // return 2;
            return new IntersectPoints(I0, I1);
        }

        // the segments are skew and may intersect in a point
        // get the intersect parameter for S1
        double sI = perp(v, w) / d;
        if (sI < 0/* || sI > 1 */) {
            // return 0;
            return EMPTY;
        }

        // get the intersect parameter for S2
        double tI = perp(u, w) / d;
        if (tI < 0 /* || tI > 1 */) {
            // return 0;
            return EMPTY;
        }

        // I0 = S1_P0 + sI * u; // compute S1 intersect point
        Point2d I0 = new Point2d(u);
        I0.scale(sI);
        I0.add(s1p0);
        // return 1;
        return new IntersectPoints(I0);
    }
