void bind(Binding binding) {
        if (params.isPositional()) {
            bindPositional(binding);
        } else {
            bindNamed(binding);
        }
    }
