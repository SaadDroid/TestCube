public void setCustomExceptionFormatter(ExceptionFormatter customFormatter) {
        if (customFormatter == null) {
            throw new IllegalArgumentException("customFormatter cannot be null");
        }
        
        if (this.customFormatter == null) {
            this.customFormatter = customFormatter;
        } else {
            // Uh-oh!  We shouldn't have more than one plugin registering a 
            // custom exception handler for a given session.  The first one 
            // wins and all others get an error message.
            s_log.error(
                "setCustomExceptionFormatter: An existing customFormatter ( "+
                this.customFormatter.getClass().getName()+" )has already " +
                "been set - ignoring "+customFormatter.getClass().getName());
        }
    }
