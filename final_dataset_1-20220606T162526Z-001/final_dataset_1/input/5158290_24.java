boolean isRecursive(ArrayList<Rule> visitedRules, Rule currentRule){
        Production tempProd;
        Iterator<Symbol> symbIt;
        Iterator<Production> prodIt;
        Symbol tempSymbol;
        Rule definingRule  ;

        if(visitedRules.size() == 0) {
            prodIt = currentRule.iterator();
        } else {
            prodIt = visitedRules.get(visitedRules.size()-1).iterator();
        }

        // Check if this is a recursive call to a previously visited rule
        if(visitedRules.contains(findRule(currentRule.getLHS()))){
            currentRule.setRecursive(true);
            return true;
        }

        // Go through each production in the rule
        while(prodIt.hasNext()){
            tempProd = prodIt.next();
            symbIt = tempProd.iterator();
            while(symbIt.hasNext()) {
                tempSymbol = symbIt.next();
                if(tempSymbol.getType() == Enums.SymbolType.NTSymbol) {
                    definingRule = findRule(tempSymbol);
                    if(definingRule != null) {
                        if(!visitedRules.contains(definingRule)) {
                            visitedRules.add(definingRule);
                            if(isRecursive(visitedRules, currentRule)) {
                                tempProd.setRecursive(true);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
