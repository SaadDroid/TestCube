public TraverseModeSet toTraverseModeSet() {
        TraverseModeSet modeSet = new TraverseModeSet();
        for (TravelMode travelMode : this) {
            TraverseMode traverseMode = (new TravelModeWrapper(travelMode)).toTraverseMode();
            modeSet.setMode(traverseMode, true);
        }

        return modeSet;
    }
