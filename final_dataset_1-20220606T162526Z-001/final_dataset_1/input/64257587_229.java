@Override
    public ProjectConfig parseProjectConfig(@Nonnull String json) throws ConfigParseException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject rootObject = (JSONObject) parser.parse(json);

            String accountId = (String) rootObject.get("accountId");
            String projectId = (String) rootObject.get("projectId");
            String revision = (String) rootObject.get("revision");
            String version = (String) rootObject.get("version");
            int datafileVersion = Integer.parseInt(version);

            List<Experiment> experiments = parseExperiments((JSONArray) rootObject.get("experiments"));

            List<Attribute> attributes;
            attributes = parseAttributes((JSONArray) rootObject.get("attributes"));

            List<EventType> events = parseEvents((JSONArray) rootObject.get("events"));
            List<Audience> audiences = Collections.emptyList();

            if (rootObject.containsKey("audiences")) {
                audiences = parseAudiences((JSONArray) parser.parse(rootObject.get("audiences").toString()));
            }

            List<Audience> typedAudiences = null;
            if (rootObject.containsKey("typedAudiences")) {
                typedAudiences = parseTypedAudiences((JSONArray) parser.parse(rootObject.get("typedAudiences").toString()));
            }

            List<Group> groups = parseGroups((JSONArray) rootObject.get("groups"));

            boolean anonymizeIP = false;
            if (datafileVersion >= Integer.parseInt(DatafileProjectConfig.Version.V3.toString())) {
                anonymizeIP = (Boolean) rootObject.get("anonymizeIP");
            }

            List<FeatureFlag> featureFlags = null;
            List<Rollout> rollouts = null;
            Boolean botFiltering = null;
            if (datafileVersion >= Integer.parseInt(DatafileProjectConfig.Version.V4.toString())) {
                featureFlags = parseFeatureFlags((JSONArray) rootObject.get("featureFlags"));
                rollouts = parseRollouts((JSONArray) rootObject.get("rollouts"));
                if (rootObject.containsKey("botFiltering"))
                    botFiltering = (Boolean) rootObject.get("botFiltering");
            }

            return new DatafileProjectConfig(
                accountId,
                anonymizeIP,
                botFiltering,
                projectId,
                revision,
                version,
                attributes,
                audiences,
                typedAudiences,
                events,
                experiments,
                featureFlags,
                groups,
                rollouts
            );
        } catch (RuntimeException ex) {
            throw new ConfigParseException("Unable to parse datafile: " + json, ex);
        } catch (Exception e) {
            throw new ConfigParseException("Unable to parse datafile: " + json, e);
        }
    }
