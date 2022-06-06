public void comment(String text)
    {
        currentText = null;

        if (current == null)
        {
            document.comment(text);
        } else
        {
            current.comment(text);
        }
    }
