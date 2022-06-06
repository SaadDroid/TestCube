@Override
    public String getValue(String propertyName) {
        if (CONFIG_ORDINAL.equals(propertyName)) {
            return null;
        }
        
        initRepository();
        initValidity();
        
        // TODO: Cache null values ? So if the config is not in the DB, cache the empty value
        // TODO: If not first time load, fire NEW Event ?
        TimedEntry entry = cache.get(propertyName);
        
        if (entry == null){
            // First time read (Or no config)
            return readFromDB(propertyName);
        }else if(entry.isExpired()) {
            // Time to refresh
            ChangeEventNotifier changeEventNotifier = ChangeEventNotifier.getInstance();
            String oldValue = entry.getValue();
            String newValue = readFromDB(propertyName);
            if(notifyOnChanges){
                // Remove Event
                if(newValue==null){
                    changeEventNotifier.fire(new ChangeEvent(Type.REMOVE,propertyName,changeEventNotifier.getOptionalOldValue(oldValue),null,NAME));
                // Change Event
                }else if(!oldValue.equals(newValue)){
                    changeEventNotifier.fire(new ChangeEvent(Type.UPDATE,propertyName,changeEventNotifier.getOptionalOldValue(oldValue),newValue,NAME));
                }
            }
            
            return newValue;
        }else{
            // Read from cache
            return entry.getValue();
        }
        
    }
