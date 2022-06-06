public static boolean isSuperOf(Class expectedParent, Class expectedChild) {
        if (expectedParent.equals(expectedChild)) {
            return false;
        }
        return expectedParent.isAssignableFrom(expectedChild);
    }
