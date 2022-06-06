public void setScriptToTokenize(String script) {
        super.setScriptToTokenize(script);
        
        // Since it is likely to have the procedure separator on it's own line, 
        // and it is key to letting us know that proceeding statements form a 
        // multi-statement procedure or function, it deserves it's own place in 
        // the _queries arraylist.  If it is followed by other procedure or 
        // function creation blocks, we may fail to detect that, so this just 
        // goes through the list and breaks apart statements on newline so that 
        // this cannot happen.
        breakApartNewLines();
        
        // MySQL allows statement separators in procedure blocks.  The process
        // of tokenizing above renders these procedure blocks as separate 
        // statements, which are not valid to be executed separately.  Here, we 
        // re-assemble any create procedure/function/trigger statements that we 
        // find using the beginning procedure block pattern and the procedure 
        // separator. 
        joinFragments(procPattern, false);
        joinFragments(funcPattern, false);
        joinFragments(triggerPattern, false);
        
        _queryIterator = _queries.iterator();
    }
