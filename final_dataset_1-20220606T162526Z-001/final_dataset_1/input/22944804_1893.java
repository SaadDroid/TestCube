@Override
    public boolean equals(Object other) {
        if (other instanceof RestSTSTokenCancellationInvocationState) {
            RestSTSTokenCancellationInvocationState otherState = (RestSTSTokenCancellationInvocationState)other;
            return cancelledTokenState.toString().equals(otherState.cancelledTokenState.toString());
        }
        return false;
    }
