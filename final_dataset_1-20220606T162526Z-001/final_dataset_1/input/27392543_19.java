@Override
  public synchronized void reset() throws IOException {
    super.reset();
    this.prevCount = this.meter.getBytesProcessedMeter().getCount();
  }
