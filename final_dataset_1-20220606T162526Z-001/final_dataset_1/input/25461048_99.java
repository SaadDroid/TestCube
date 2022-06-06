public ArrayList<String> addElementsByMethodReflect(ArrayList<String> arrayList, Object value) {
        /*
         * Illegal value type:
         * arrayList.add(value);
         */

        Class arrayListClass = arrayList.getClass();
        try {
            Method method = arrayListClass.getMethod("add", Object.class);
            method.invoke(arrayList, value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
