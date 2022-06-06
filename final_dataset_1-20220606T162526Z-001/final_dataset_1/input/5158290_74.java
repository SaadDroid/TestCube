public void setProperties(Properties p) {
	String key;
        int size;
        int popSize;
	double valueD = 1.0;
        key = Constants.POPULATION_SIZE;
        popSize = Integer.parseInt(p.getProperty(key, Constants.DEFAULT_POPULATION_SIZE));
	key = Constants.REPLACEMENT_TYPE;
	if(p.getProperty(key)!=null) {
	    if(p.getProperty(key).equals(Constants.STEADY_STATE)) {
		valueD = 1.0/popSize;
	    } else {
		if(p.getProperty(key).equals(Constants.GENERATIONAL)) {
		    valueD = 1.0;
		}
	    }
	} else {
            key = Constants.GENERATION_GAP;
	    try {
		if(p.getProperty(key)!=null) {
		    valueD = Double.parseDouble(p.getProperty(key));
		    if(valueD < 0.0 || valueD > 1.0) {
			throw new BadParameterException(key);
		    }
		}
	    } catch(Exception e) {
		valueD = 1.0;
		logger.warn(e+" using default: "+valueD);
	    }
        }
        size = (int)(popSize*valueD);
        this.replacementSize = size;
    }
