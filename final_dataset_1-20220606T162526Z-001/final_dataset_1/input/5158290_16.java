@SuppressWarnings({"LoopStatementThatDoesntLoop"})
    boolean growNode(DerivationNode t) {
        Symbol s = t.getData();
        if(this.getDepth() > grammy.getMaxDerivationTreeDepth()) {
            logger.warn("maxDerivationTreeDepth exceeded:" + this.getDepth()+">"+grammy.maxDerivationTreeDepth);
            return false;
        }
        if(this.geneCnt > this.genny.getMaxChromosomeLength()) {
      	  logger.warn("maxGEChromosomeLength exceeded:" + this.geneCnt+">"+genny.getMaxChromosomeLength());
            return false;
        } 
        
        if(s.getType()==Enums.SymbolType.NTSymbol){
            Rule r = this.grammy.findRule(s);
            int numProd = r.size();
            if(!this.genIter.hasNext()){
                this.wrapCount++;
                this.genIter = genny.iterator();
            }
                
            //Use a codon if there is more then one production
            while(this.wrapCount <= this.grammy.getMaxWraps()) {
                Production p;
                int currentCodonValue;
                if(numProd>1) {
                    currentCodonValue = this.genIter.next();
                    t.setCodonIndex
                    (   geneCnt,
                        /* currentCodonValue,*/
                        currentCodonValue % numProd
                    );
                    this.geneCnt++;
                    p= r.get(currentCodonValue % numProd);
                } else {
                    p = r.get(0);                
                }
                Iterator<Symbol> symIt = p.iterator();
                DerivationNode newTree;
                Symbol newSym;
                while(symIt.hasNext()) {
                    newSym = symIt.next();
                    // Check for GECodonValue
                    if(newSym.getType() == Enums.SymbolType.NTSymbol && newSym.getSymbolString().startsWith(Constants.GE_CODON_VALUE_PARSING)) {
                        String value;
                        
                        // Create a new symbol from the GE codon value
                        // GE Codon uses a codon from the genotype
                        if(!this.genIter.hasNext()){
                            this.genIter = genny.iterator();
                            this.wrapCount++;
                        }
                        this.geneCnt++;
                        currentCodonValue = this.genIter.next();
                        
                        try {
			    value = getGECodonValue(newSym.getSymbolString(), currentCodonValue);
			} catch (MalformedGrammarException e) {
				logger.error("Malformed GECodonValue specification in grammar");
			    return false;
			}
                        newSym = new Symbol(value, Enums.SymbolType.TSymbol);
                    }
                    newTree = new DerivationNode(t, newSym);
                    t.add(newTree);
                    this.setCurrentLevel(this.getCurrentLevel()+1);
                    if(this.getDepth()<this.getCurrentLevel()) {
                        this.setDepth(this.getCurrentLevel());
                    }
                    if(!growNode(newTree)) {
                        return false;
                    }
                    this.setCurrentLevel(this.getCurrentLevel()-1);
                }
                return true;
            }
            return false;
        } else {
            this.grammy.getPhenotype().add(s);
            
            //System.out.print(s.getSymbolString() + " ");
            //System.out.print(" p:"+this.grammy.phenotype.getString() + " ");
            return true;
        }
    }
