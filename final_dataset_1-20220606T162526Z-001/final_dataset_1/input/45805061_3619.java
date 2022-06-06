public static YieldCurve withPointShifts(YieldCurve curve, List<Double> t, List<Double> shifts, ShiftType shiftType) {
    return withPointShifts(curve, t, shifts, shiftType, POINT_SHIFT_NAME);
  }
