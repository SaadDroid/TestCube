String getGECodonValueLegacyFormat(String s, int codon) {
        int low = 0;
        int high = -1;
        int i = Constants.GE_CODON_VALUE_PARSING.length(); //Start value for codon counter
        String codon_value;
        char currentChar = s.charAt(i);// currentChar is first character after "<GECodonValue"
        // Look for range definitions
        while(currentChar != '>'){
            if(currentChar == '-'){// Low range specification
                currentChar = s.charAt(i++);
                while((currentChar >= '0') && (currentChar <= '9')){
                    low = (low * 10) + (currentChar - '0');
                    currentChar = s.charAt(i++);
                }
            } else if(currentChar == '+'){// High range specification
                currentChar = s.charAt(i++);
                while((currentChar >= '0') && (currentChar <= '9')){
                    if(high == -1){
                        high = 0;
                    }
                    high = (high * 10) + (currentChar - '0');
                    currentChar = s.charAt(i++);
                }
            } else{// Ignore errors
                currentChar = s.charAt(i++);
            }
        }
        // High range was not specified, so set it to maximum
        if(high == -1){
            high = genny.getMaxCodonValue();
        }
        if(high == low){// Catch division by zero
            codon_value = String.valueOf(low);
        } else{
            codon = (codon%(high-low+1))+low;
            codon_value = String.valueOf(codon);
        }
        return codon_value;
    }
