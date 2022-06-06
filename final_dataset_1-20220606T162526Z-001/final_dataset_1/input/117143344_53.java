public static Span fromString(String str) {
    str = str.trim();
    int sadj = 0;
    if (str.startsWith("("))
    	sadj = 1;
    else if (str.startsWith("["))
    	sadj = 0;
    else
    	throw new IllegalArgumentException("bad span string: "+str);
    int eadj = 0;
    if (str.endsWith(")"))
    	eadj = 0;
    else if (str.endsWith("]"))
    	eadj = 1;
    else
    	throw new IllegalArgumentException("bad span string: "+str);
    int mid = str.indexOf(INTERVAL_SEP_SYMBOL);
    String begin = str.substring(1, mid).trim();
    String end = str.substring(mid + 1, str.length()-1).trim();
    try {
    	return new Span(Integer.parseInt(begin)+sadj, Integer.parseInt(end)+eadj);
    } catch (NumberFormatException nfe) {
    	throw new IllegalArgumentException("bad span string: "+str);
    }
  }
