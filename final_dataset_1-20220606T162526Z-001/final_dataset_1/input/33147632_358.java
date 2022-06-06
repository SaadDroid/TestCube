@Override
    public void updateDrawState(TextPaint ds) {
        if (colored) {
            ds.setColor(linkColor);
        } else {
            ds.setColor(ds.linkColor);
        }

        if (selected) {
            ds.bgColor = selectedColor;
        } else {
            ds.bgColor = Color.TRANSPARENT;
        }

        if (underlined) {
            ds.setUnderlineText(true);
        }
    }
