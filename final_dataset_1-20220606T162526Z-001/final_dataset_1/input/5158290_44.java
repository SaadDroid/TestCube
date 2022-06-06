public void setDouble(double f) {
	if(Double.isNaN(f) || Double.isInfinite(f)) {
	    f = BasicFitness.Max_Double;
	}
        this.value = f;
    }
