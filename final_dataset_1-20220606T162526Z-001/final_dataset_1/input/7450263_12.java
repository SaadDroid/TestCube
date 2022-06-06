@Override
   public void saveMessage(String topicName, SwallowMessage message) {
      DBCollection collection = this.mongoClient.getMessageCollection(topicName);

      BasicDBObjectBuilder builder = BasicDBObjectBuilder.start().add(ID, new BSONTimestamp());
      //content
      String content = message.getContent();
      if (content != null && !"".equals(content.trim())) {
         builder.add(CONTENT, content);
      }
      //generatedTime
      Date generatedTime = message.getGeneratedTime();
      if (generatedTime != null) {
         builder.add(GENERATED_TIME, generatedTime);
      }
      //version
      String version = message.getVersion();
      if (version != null && !"".equals(version.trim())) {
         builder.add(VERSION, version);
      }
      //properties
      Map<String, String> properties = message.getProperties();
      if (properties != null && properties.size() > 0) {
         builder.add(PROPERTIES, properties);
      }
      //internalProperties
      Map<String, String> internalProperties = message.getInternalProperties();
      if (internalProperties != null && internalProperties.size() > 0) {
         builder.add(INTERNAL_PROPERTIES, internalProperties);
      }
      //sha1
      String sha1 = message.getSha1();
      if (sha1 != null && !"".equals(sha1.trim())) {
         builder.add(SHA1, sha1);
      }
      //type
      String type = message.getType();
      if (type != null && !"".equals(type.trim())) {
         builder.add(TYPE, type);
      }
      //sourceIp
      String sourceIp = message.getSourceIp();
      if (sourceIp != null && !"".equals(sourceIp.trim())) {
         builder.add(SOURCE_IP, sourceIp);
      }
      collection.insert(builder.get());
   }
