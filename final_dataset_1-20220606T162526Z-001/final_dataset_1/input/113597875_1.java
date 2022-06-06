@Override
    public synchronized ExtendedStackTraceElement[] get() {
        if (est == null) {
            final StackTraceElement[] st = t.getStackTrace();
            if (st != null) {
                est = new ExtendedStackTraceElement[st.length - 1];
                for (int i = 1, k = 2; i < st.length; i++, k++) {
                    if (skipCTX(classContext[k])) {
                        i--;
                    } else {
                        final StackTraceElement ste = st[i];
                        final Class<?> clazz;

                        if (skipSTE(st[i])) {
                            k--;
                            clazz = null;
                        } else {
                            clazz = classContext[k];
                        }

                        est[i - 1] = new BasicExtendedStackTraceElement(ste, clazz);
                        // System.out.println(">>>> " + k + ": " + (clazz != null ? clazz.getName() : null) + " :: " + i + ": " + ste);
                    }
                }
            }
        }
        return est;
    }
