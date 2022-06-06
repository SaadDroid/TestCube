@Override
    public boolean equals(Object o) {
        if (o ==  null) {
            return false;
        }
        else if (o == this) {
            return true;
        }
        else if (o.getClass().equals(getClass())) {
            final TypeMatcher matcher = (TypeMatcher)o;
            return matcher.type.equals(type);
        }
        else {
            return false;
        }
    }
