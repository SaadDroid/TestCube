public void setAngle(double angle) throws IOException {
        if (angle < mMinAngle || angle > mMaxAngle) {
            throw new IllegalArgumentException("angle (" + angle + ") not in range [" + mMinAngle
                    + ", " + mMaxAngle + "]");
        }
        mAngle = angle;
        updateDutyCycle();
    }
