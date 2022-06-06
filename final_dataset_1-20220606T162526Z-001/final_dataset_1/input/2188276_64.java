public String getText()
    {
        String text = qualifier != null ? qualifier+"."+name : name;

        if(hasTextPosition()) {
            int oldDataPos = endPosition - startPosition;
            return text.substring(oldDataPos, text.length());
        } else {
            return text;
        }
    }
