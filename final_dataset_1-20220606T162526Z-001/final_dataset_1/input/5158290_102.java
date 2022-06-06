Individual getRandomNotThis(Individual me) {
        this.population.remove(me);
        Individual notMe;
        notMe = this.population.get(rng.nextInt(this.population.size()));
        this.population.add(me);
        return notMe;
    }
