@Override
    public boolean shouldInclude(PropertySource<?> source, String name) {
        if (isIncludeAll()) {
            return true;
        }

        if (isMatch(source.getName(), excludeSourceNames) || isMatch(name, excludePropertyNames)) {
            return false;
        }

        return isIncludeUnset() || isMatch(source.getName(), includeSourceNames) || isMatch(name, includePropertyNames);

    }
