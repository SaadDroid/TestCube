public static boolean verifyOrder(List<ActualParam> actualParams) {
        boolean findNamed = false;
        for (ActualParam actualParam : actualParams) {
            if (findNamed && (!actualParam.isNamed() && !actualParam.isAsterisk())) {
                return false;
            }
            findNamed = findNamed || actualParam.isNamed();
        }
        return true;
    }
