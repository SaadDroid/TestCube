@SuppressWarnings("unchecked")
    public void load(String path) throws IOException {
        InputStream in;
        if (path.startsWith(CLASSPATH)) {
            in = ConfigReader.class.getResourceAsStream(path.substring(CLASSPATH.length()));
        } else if (path.startsWith(FILEPATH)) {
            in = new FileInputStream(new File(path.substring(FILEPATH.length())));
        } else {
            in = ConfigReader.class.getResourceAsStream(path);
        }
        if (in == null) {
            throw new IOException(path+" not found");
        }
        try {
            if (path.endsWith(YML) || path.endsWith(YAML)) {
                Yaml yaml = new Yaml();
                String data = Utility.getInstance().stream2str(in);
                Map<String, Object> m = yaml.load(data.contains("\t")? data.replace("\t", "  ") : data);
                enforceKeysAsText(m);
                config = new MultiLevelMap(normalizeMap(m));
                isNormalized = true;

            } else if (path.endsWith(JSON)) {
                Map<String, Object> m = SimpleMapper.getInstance().getMapper().readValue(in, Map.class);
                enforceKeysAsText(m);
                config = new MultiLevelMap(normalizeMap(m));
                isNormalized = true;

            } else if (path.endsWith(PROPERTIES)) {
                properties = new HashMap<>();
                Properties p = new Properties();
                p.load(in);
                for (Object k : p.keySet()) {
                    properties.put(k.toString(), p.get(k));
                }
                isNormalized = false;
            }
            // load environment variables if any
            Object o = isNormalized? config.getElement(ENV_VARIABLES) : properties.get(ENV_VARIABLES);
            if (o != null) {
                envVars = getEnvVars(o);
            }
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                //
            }
        }
    }
