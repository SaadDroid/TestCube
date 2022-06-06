public void doOperation(Individual operand) {
        GEIndividual ind = (GEIndividual) operand;
        //ind = new GEIndividual(ind);
        ind.setGenotype(this.getGenotype(((GEChromosome) ind.getGenotype().get(0)).getMaxChromosomeLength()));
    //ind.getMapper().setGenotype(ind.getGenotype().get(0));

    }
