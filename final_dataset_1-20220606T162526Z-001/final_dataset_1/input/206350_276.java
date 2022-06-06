@Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof DbArcId)) {
            return false;
        }

        DbArcId id = (DbArcId) object;

        return new EqualsBuilder().append(sourceId, id.sourceId)
                .append(incomingArc.getName(), id.incomingArc.getName())
                .isEquals();
    }
