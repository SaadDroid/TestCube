@Override
    public boolean isComplete() {
        return beforeProcessor.isComplete() && afterProcessor.isComplete();
    }
