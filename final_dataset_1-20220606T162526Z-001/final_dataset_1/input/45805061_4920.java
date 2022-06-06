public InterestRateCurveSensitivity cleaned() {
    return new InterestRateCurveSensitivity(InterestRateCurveSensitivityUtils.clean(_sensitivity, 0, 0));
  }
