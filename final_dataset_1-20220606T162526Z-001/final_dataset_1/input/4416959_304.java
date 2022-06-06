@SuppressWarnings("unchecked")
    public List<String> getResourcePaths(String path)
    {
        List<String> result = CollectionFactory.newList();
        Stack<String> queue = CollectionFactory.newStack();

        queue.push(path);

        while (!queue.isEmpty())
        {
            String current = queue.pop();

            Set<String> matches = servletContext.getResourcePaths(current);

            // Tomcat 5.5.20 inside JBoss 4.0.2 has been observed to do this!
            // Perhaps other servers do as well.

            if (matches == null) continue;

            for (String match : matches)
            {
                // Folders are queued up for further expansion.

                if (match.endsWith("/")) queue.push(match);
                else result.add(match);
            }
        }

        Collections.sort(result);

        return result;
    }
