@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bag<?> other = (Bag<?>)obj;
        if (size != other.size) {
            return false;
        }
        return map.equals(other.map);
    }
