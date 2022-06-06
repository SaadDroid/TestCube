public void setProperties(Properties p) {
        //Set samples
        //FIXME (If there is a random range there must be a random number generator)
        this.range = new Range(p.getProperty(Constants.SR_RANGE), this.rng);
        //Set the dimensions
        this.x = new double[this.range.getDimensions()];
        //Get the initial samples
        //FIXME(If random target must be calculated everytime)
        this.samples = this.range.getSamples();
        //Set the target
        this.calculateTarget(p.getProperty(Constants.SR_TARGET));
    }
