public String handleRequest(HttpRequest request)
    {
        if(getSuccessor() != null)
        {
            return getSuccessor().handleRequest(request);
        }
        else
        {
        	throw new IllegalStateException("No valid handler found!");
        }
        
    }
