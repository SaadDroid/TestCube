@Override
    public ProjectConfig parseProjectConfig(@Nonnull String json) throws ConfigParseException {
        try {
            JSONObject rootObject = new JSONObject(json);

            String accountId = rootObject.getString("accountId");
            String projectId = rootObject.getString("projectId");
            String revision = rootObject.getString("revision");
            String version = rootObject.getString("version");
            int datafileVersion = Integer.parseInt(version);

            List<Experiment> experiments = parseExperiments(rootObject.getJSONArray("experiments"));

            List<Attribute> attributes;
            attributes = parseAttributes(rootObject.getJSONArray("attributes"));

            List<EventType> events = parseEvents(rootObject.getJSONArray("events"));
            List<Audience> audiences = Collections.emptyList();

            if (rootObject.has("audiences")) {
                audiences = parseAudiences(rootObject.getJSONArray("audiences"));
            }

            List<Audience> typedAudiences = null;
            if (rootObject.has("typedAudiences")) {
                typedAudiences = parseTypedAudiences(rootObject.getJSONArray("typedAudiences"));
            }

            List<Group> groups = parseGroups(rootObject.getJSONArray("groups"));

            boolean anonymizeIP = false;
            if (datafileVersion >= Integer.parseInt(ProjectConfig.Version.V3.toString())) {
                anonymizeIP = rootObject.getBoolean("anonymizeIP");
            }

            List<FeatureFlag> featureFlags = null;
            List<Rollout> rollouts = null;
            Boolean botFiltering = null;
            if (datafileVersion >= Integer.parseInt(ProjectConfig.Version.V4.toString())) {
                featureFlags = parseFeatureFlags(rootObject.getJSONArray("featureFlags"));
                rollouts = parseRollouts(rootObject.getJSONArray("rollouts"));
                if (rootObject.has("botFiltering"))
                    botFiltering = rootObject.getBoolean("botFiltering");
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
        } catch (Exception e) {
            throw new ConfigParseException("Unable to parse datafile: " + json, e);
        }
    }
