public Range span(Range other)
    {
        Marker lowMarker = Marker.min(low, other.getLow());
        Marker highMarker = Marker.max(high, other.getHigh());

        return new Range(lowMarker, highMarker);
    }
