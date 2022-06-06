public void handle(DAGHistoryEvent event) {
    eventQueue.add(event);
  }
