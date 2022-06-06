public void doUpdate(List<String> lines)
    {
        Map<String, Integer> values = Maps.newHashMap();
        for ( String line : lines )
        {
            String[]        parts = line.split("\\s");
            if ( parts.length == 2 )
            {
                try
                {
                    String  name = parts[0];
                    int     value = Integer.parseInt(parts[1]);
                    values.put(name, value);
                }
                catch ( NumberFormatException ignore )
                {
                    // ignore
                }
            }
        }

        monitor.updateValues(values);
    }
