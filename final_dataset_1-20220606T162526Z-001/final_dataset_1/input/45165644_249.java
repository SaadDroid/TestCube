@Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        if (oldExchange == null) {
            return newExchange;
        }

        String in1 = (String) oldExchange.getIn().getBody();
        String in2 = (String) newExchange.getIn().getBody();

        oldExchange.getIn().setBody(in1 + ";" + in2);

        return oldExchange;
    }
