@SuppressLint("SetTextI18n")
    @Override
    public void onTextChanged(CharSequence s, int ignoredParam1, int ignoredParam2, int
            ignoredParam3) {
        // The listener is expected to be used in conjunction with the SpacedEditText.

        // Approach
        // 1) Strip all spaces and hyphens introduced by the SET for aesthetics
        final String numericContents = s.toString().replaceAll(" ", "").replaceAll(placeHolder, "");

        // 2) Trim the content to acceptable length.
        final int enteredContentLength = Math.min(numericContents.length(), expectedContentLength);
        final String enteredContent = numericContents.substring(0, enteredContentLength);

        // 3) Reset the text to be the content + required hyphens. The SET automatically inserts
        // spaces requires for aesthetics. This requires removing and reseting the listener to
        // avoid recursion.
        editText.removeTextChangedListener(this);
        editText.setText(enteredContent + postFixes[expectedContentLength - enteredContentLength]);
        editText.setSelection(enteredContentLength);
        editText.addTextChangedListener(this);

        // 4) Callback listeners waiting on content to be of expected length
        if (enteredContentLength == expectedContentLength && callback != null) {
            callback.whileComplete();
        } else if (callback != null) {
            callback.whileIncomplete();
        }
    }
