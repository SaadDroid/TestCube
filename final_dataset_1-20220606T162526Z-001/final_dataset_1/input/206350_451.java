@Override
    public V merge(K key, V newValue, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        if(this.key.equals(key)) {
            return value = value == null ? newValue : remappingFunction.apply(value, newValue);
        }
        throw new IllegalArgumentException("This map supports only key '" + this.key + "'");
    }
