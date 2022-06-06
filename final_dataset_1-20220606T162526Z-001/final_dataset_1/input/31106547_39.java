@Override
    public String createBody(Check check, Subscription subscription, List<Alert> alerts) {
        VelocityContext context = createVelocityContext(check, subscription, alerts);
        StringWriter stringWriter = new StringWriter();
        Velocity.evaluate(context, stringWriter, "EmailNotificationService", TEMPLATE_CONTENT);
        return stringWriter.toString();
    }
