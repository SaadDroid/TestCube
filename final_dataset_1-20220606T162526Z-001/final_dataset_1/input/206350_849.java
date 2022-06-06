public void setPrimaryKey(boolean primaryKey) {
        if (this.primaryKey != primaryKey) {
            this.primaryKey = primaryKey;

            Entity e = this.getEntity();
            if (e instanceof DbAttributeListener) {
                ((DbAttributeListener) e).dbAttributeChanged(new AttributeEvent(this, this, e));
            }
        }
    }
