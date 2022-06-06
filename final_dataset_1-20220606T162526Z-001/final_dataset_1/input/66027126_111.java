@Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof MediaType))
        {
            return false;
        }
        MediaType other = (MediaType) obj;

        return mMainType.equalsIgnoreCase(other.mainType()) && mSubType.equalsIgnoreCase(other.subType());
    }
