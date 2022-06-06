@Override
    public String toString() {
        return "ProjectConfig{" +
            "accountId='" + accountId + '\'' +
            ", projectId='" + projectId + '\'' +
            ", revision='" + revision + '\'' +
            ", version='" + version + '\'' +
            ", anonymizeIP=" + anonymizeIP +
            ", botFiltering=" + botFiltering +
            ", attributes=" + attributes +
            ", audiences=" + audiences +
            ", typedAudiences=" + typedAudiences +
            ", events=" + events +
            ", experiments=" + experiments +
            ", featureFlags=" + featureFlags +
            ", groups=" + groups +
            ", rollouts=" + rollouts +
            ", attributeKeyMapping=" + attributeKeyMapping +
            ", eventNameMapping=" + eventNameMapping +
            ", experimentKeyMapping=" + experimentKeyMapping +
            ", featureKeyMapping=" + featureKeyMapping +
            ", audienceIdMapping=" + audienceIdMapping +
            ", experimentIdMapping=" + experimentIdMapping +
            ", groupIdMapping=" + groupIdMapping +
            ", rolloutIdMapping=" + rolloutIdMapping +
            ", variationIdToExperimentMapping=" + variationIdToExperimentMapping +
            '}';
    }
