public static boolean compareObjectsAndNull(Object object1, Object object2) {
        if ((object1 == null && object2 == null) || (object1 != null && object1.equals(object2))) {
            return true;
        } else {
            return false;
        }
    }
