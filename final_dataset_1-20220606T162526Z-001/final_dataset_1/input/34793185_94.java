@Override
    public void onBlur(BlurEvent event) {
        String inputValue = widget.getConstraintMatchValue();
        if (inputValue == null || inputValue.trim().isEmpty()) {
            widget.showError(translationService.getTranslation(ConstraintMatchInputWidgetBlurHandler_EmptyValuesAreNotAllowedForModifyScore));
        } else {
            inputValue = inputValue.trim();
            if (inputValue.matches("-?\\s*\\d+(\\.\\d+)?.*")) {
                switch (scoreHolderType) {
                    // int
                    case "org.optaplanner.core.api.score.buildin.bendable.BendableScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.simple.SimpleScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardmediumsoft.HardMediumSoftScoreHolder": {
                        try {
                            Integer.parseInt(inputValue);
                        } catch (NumberFormatException e) {
                            widget.showError(translationService.getTranslation(ConstraintMatchInputWidgetBlurHandler_IntegerValueParsingError));
                            return;
                        }
                        break;
                    }
                    // long
                    case "org.optaplanner.core.api.score.buildin.bendablelong.BendableLongScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.simplelong.SimpleLongScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardsoftlong.HardSoftLongScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardmediumsoftlong.HardMediumSoftLongScoreHolder": {
                        try {
                            Long.parseLong(inputValue);
                        } catch (NumberFormatException e) {
                            widget.showError(translationService.getTranslation(ConstraintMatchInputWidgetBlurHandler_LongValueParsingError));
                            return;
                        }
                        break;
                    }
                    // double
                    case "org.optaplanner.core.api.score.buildin.simpledouble.SimpleDoubleScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardsoftdouble.HardSoftDoubleScoreHolder": {
                        try {
                            Double.parseDouble(inputValue);
                        } catch (NumberFormatException e) {
                            widget.showError(translationService.getTranslation(ConstraintMatchInputWidgetBlurHandler_DoubleValueParsingError));
                            return;
                        }
                        break;
                    }
                    // java.math.BigDecimal
                    case "org.optaplanner.core.api.score.buildin.bendablebigdecimal.BendableBigDecimalScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.simplebigdecimal.SimpleBigDecimalScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardsoftbigdecimal.HardSoftBigDecimalScoreHolder":
                    case "org.optaplanner.core.api.score.buildin.hardmediumsoftbigdecimal.HardMediumSoftBigDecimalScoreHolder": {
                        try {
                            new BigDecimal(inputValue);
                        } catch (NumberFormatException e) {
                            widget.showError(translationService.getTranslation(ConstraintMatchInputWidgetBlurHandler_BigDecimalValueParsingError));
                            return;
                        }
                        break;
                    }

                }
            }
            widget.clearError();
        }
    }
