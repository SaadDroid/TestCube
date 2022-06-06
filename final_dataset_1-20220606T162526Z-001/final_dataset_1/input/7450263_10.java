@Override
   public Date updateLastHeartbeat(String ip) {
      DBCollection collection = this.mongoClient.getHeartbeatCollection(ip.replace('.', '_'));

      Date curTime = new Date();
      DBObject insert = BasicDBObjectBuilder.start().add(TICK, curTime).get();
      collection.insert(insert);
      return curTime;
   }
