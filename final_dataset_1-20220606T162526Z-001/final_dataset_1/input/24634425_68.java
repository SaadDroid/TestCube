@Override
    public boolean equals(Object obj) {
        if (obj instanceof TimePeriod) {
            TimePeriod comp = (TimePeriod) obj;
            return (startTime.equals(comp.startTime)
                    && endTime.equals(comp.endTime));
        } else {
            return false;
        }
    }
