public static String getPreAlgoResult(String algoName, String algoPara, String colValue) {
        BlockingKeyPreAlgorithmEnum typeBySavedValue = BlockingKeyPreAlgorithmEnum.getTypeBySavedValue(algoName);
        switch (typeBySavedValue) {
        case NON_ALGO:
            break;
        case REMOVE_MARKS:
            return AlgoBox.removeDiacriticalMarks(colValue);
        case REMOVE_MARKS_THEN_LOWER_CASE:
            return AlgoBox.removeDMAndLowerCase(colValue);
        case REMOVE_MARKS_THEN_UPPER_CASE:
            return AlgoBox.removeDMAndUpperCase(colValue);
        case LOWER_CASE:
            return AlgoBox.lowerCase(colValue);
        case UPPER_CASE:
            return AlgoBox.upperCase(colValue);
        case LEFT_CHAR:
            return AlgoBox.add_Left_Char(colValue, algoPara);
        case RIGHT_CHAR:
            return AlgoBox.add_Right_Char(colValue, algoPara);
        default:
            return StringUtils.EMPTY;
        }

        return StringUtils.EMPTY;
    }
