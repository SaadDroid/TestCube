@Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        if(this.key.equals(key)) {
            return value = remappingFunction.apply(key, value);
        }
        throw new IllegalArgumentException("This map supports only key '" + this.key + "'");
    }
