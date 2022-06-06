@Override
   public void waitUntilMasterUp(String ip, long checkInterval, long maxStopTime) throws InterruptedException {
      Date beat = null;
      LOG.info("start to wait " + ip + " master up");
      while (true) {
         try {
            beat = heartbeatDAO.findLastHeartbeat(ip);
         } catch (Exception e) {
            LOG.error("error find last heartbeat", e);
            Thread.sleep(1000);
            continue;
         }
         if (beat != null) {
            long lastBeatTime = beat.getTime();
            long now = System.currentTimeMillis();
            if (now - lastBeatTime < maxStopTime) {
               if (LOG.isDebugEnabled()) {
                  LOG.debug(ip + " beat at " + beat.getTime());
               }
               break;
            }
         }
         Thread.sleep(checkInterval);
      }
      LOG.info(ip + " master up, slave shutdown");
   }
