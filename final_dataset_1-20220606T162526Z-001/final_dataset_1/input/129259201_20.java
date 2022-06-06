@Override
    public Object saveState(FacesContext context)
    {
        resetClientIds(this);

        if (initialStateMarked()) {
            Object superState = super.saveState(context);

            if (superState == null && _rowDeltaStates.isEmpty()) {
                return null;
            }
            else {
                Object values[] = null;
                Object attachedState = UIComponentBase.saveAttachedState(context, _rowDeltaStates);
                if (superState != null || attachedState != null) {
                    values = new Object[] { superState, attachedState };
                }
                return values;
            }
        } else {
            Object values[] = new Object[2];
            values[0] = super.saveState(context);
            values[1] = UIComponentBase.saveAttachedState(context, _rowDeltaStates);
            return values;
        }
    }
