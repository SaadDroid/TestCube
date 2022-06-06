public static String asKey(ModelNode address, boolean fq) {

        List<Property> tuples = address.asPropertyList();
        StringBuilder sb = new StringBuilder();

        int i=0;
        for (final Property tuple : tuples) {
            if(i>0) sb.append("/");

            sb.append(tuple.getName());
            sb.append("=");

            if(i==tuples.size()-1)
                if(fq)
                    sb.append(escapeValue(tuple.getValue().asString()));
                else
                    sb.append("*");
            else
                sb.append(escapeValue(tuple.getValue().asString()));

            i++;
        }

        //if(tuples.isEmpty())
        //    sb.append("ROOT"); // better then empty string

        return sb.toString();
    }
