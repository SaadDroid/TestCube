void stopWriterThreads() throws InterruptedException {
    for (WriterThread writerThread : writerThreads) {
      writerThread.disableWriter();
      writerThread.interrupt();
      writerThread.join();
    }
  }
