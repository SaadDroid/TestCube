@Override
    public void sendNotification(Check check, Subscription subscription, List<Alert> alerts) throws NotificationFailedException {
       String twilioUrl = StringUtils.trimToNull(seyrenConfig.getTwilioUrl());
        
        if (twilioUrl == null) {
            LOGGER.warn("Twilio URL needs to be set before sending notifications to Twilio");
            return;
        }
        
        String body;
        if (check.getState() == AlertType.ERROR) {
            body = "ERROR Check "+check.getName()+" has exceeded its threshold.";
        } else if (check.getState() == AlertType.OK) {
            body = "OK Check "+check.getName()+" has been resolved.";
        } else {
            LOGGER.warn("Did not send notification to Twilio for check in state: {}", check.getState());
            body = null;
        }        
        
        List<NameValuePair> params=new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", subscription.getTarget()));
        params.add(new BasicNameValuePair("From", seyrenConfig.getTwilioPhoneNumber()));
        params.add(new BasicNameValuePair("Body", body));

        HttpClient client = HttpClientBuilder.create().build();
        
        HttpPost post = new HttpPost(twilioUrl + "/"+seyrenConfig.getTwilioAccountSid()+"/Messages");
        try {
            String credentials=seyrenConfig.getTwilioAccountSid()+":"+seyrenConfig.getTwilioAuthToken();
            post.setHeader(new BasicHeader("Authorization", "Basic "+Base64.encodeBase64String(credentials.getBytes("UTF-8"))));
            
            HttpEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
            post.setEntity(entity);
            
            HttpResponse response=client.execute(post);
            if(response.getStatusLine().getStatusCode()/100 != 2)
                throw new IOException("API request failed: "+response.getStatusLine());
        } catch (IOException e) {
            throw new NotificationFailedException("Sending notification to Twilio at " + twilioUrl + " failed.", e);
        } finally {
            HttpClientUtils.closeQuietly(client);
        }
    }
