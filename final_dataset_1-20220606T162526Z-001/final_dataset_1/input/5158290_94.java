Fitness[] rankPopulation(List<Individual> operands){
        Fitness[] fAt = new Fitness[operands.size()];
        
        //System.out.print("EliteRank org:");
        for(int i=0;i<fAt.length;i++) {
            fAt[i] = operands.get(i).getFitness();
            //System.out.print(fAt[i].getDouble()+",");
        }
        //System.out.println();
        //Sort ascending
        Arrays.sort(fAt);
        return fAt;
    }
