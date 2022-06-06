@Override
    public void apply(View view, View parent, String name, Context context, AttributeSet attributeSet) {
        if (!clazz().isAssignableFrom(view.getClass())) {
            return;
        }

        values = obtainAttributes(context, attributeSet);
        if(values == null || values.length() == 0) return;

        try {
            for (int i = 0; i < values.length(); i++) {
                TypedValue buf = new TypedValue();
                if (values.hasValue(i) && values.getValue(i, buf)) {
                    apply((T) view, values);
                    break;
                }
            }
        } finally {
            values.recycle();
        }
    }
