@Override
    public Type flatten() {
        return head.flatten(tail.flatten_());
    }
