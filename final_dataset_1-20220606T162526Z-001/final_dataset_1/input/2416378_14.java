public boolean inherits(ASTType astType, ASTType inheritable) {
        if (astType == null) {
            return false;
        }
        if(inheritable == null || inheritable.equals(OBJECT_TYPE)){
            return true;
        }
        if (astType.equals(inheritable)) {
            return true;
        }
        for (ASTType typeInterfaces : astType.getInterfaces()) {
            if (inherits(typeInterfaces, inheritable)) {
                return true;
            }
        }
        return inherits(astType.getSuperClass(), inheritable);
    }
