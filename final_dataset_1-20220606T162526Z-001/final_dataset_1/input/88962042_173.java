public <U> ChainableFunction<F, U> then(final Function<? super T, ? extends U> function) {
        return new ChainableFunction<F, U>() {
            @Override
            public U apply(F input) {
                return function.apply(ChainableFunction.this.apply(input));
            }
        };
    }
