public String disableDebugging(String sourceCode) throws IOException {
        int index = sourceCode.indexOf(DEBUG_POSTFIX);
        if (index == -1) {
            return sourceCode;
        }
        int pos = index + DEBUG_POSTFIX.length();
        String data = sourceCode.substring(pos);
        if (data.startsWith("\n")) { 
            /* in this case this means that first line was not a sheebang - e.g. "#! /bin bash" or so and so there was a newline added
             * and we must remove it as well!
             */
            data=data.substring(1);
        }
        return data;
    }
