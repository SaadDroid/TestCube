public PF(int n) {
		this.particleNumbers = n;
		MIN_NEFF = 2*n/3;
		particles = new Particle[particleNumbers];
		LOGGER.debug("particle numbers: {}", particleNumbers);
	}
