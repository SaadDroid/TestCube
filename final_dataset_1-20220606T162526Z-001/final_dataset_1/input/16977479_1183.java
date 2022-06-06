public boolean match(String uri, MultivaluedMap<String, String> templateVariableToValue) {

        if (uri == null) {
            return (templateRegexPattern == null) ? true : false;
        }

        if (templateRegexPattern == null) {
            return false;
        }

        Matcher m = templateRegexPattern.matcher(uri);
        if (!m.matches() || template.equals(SLASH) && uri.startsWith(SLASH_QUOTE)) {
            if (uri.contains(";")) {
                // we might be trying to match one or few path segments
                // containing matrix
                // parameters against a clear path segment as in @Path("base").
                List<PathSegment> pList = JAXRSUtils.getPathSegments(template, false);
                List<PathSegment> uList = JAXRSUtils.getPathSegments(uri, false);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < uList.size(); i++) {
                    String segment = null;
                    if (pList.size() > i && pList.get(i).getPath().indexOf('{') == -1) {
                        segment = uList.get(i).getPath();
                    } else {
                        segment = HttpUtils.fromPathSegment(uList.get(i));
                    }
                    if (segment.length() > 0) {
                        sb.append(SLASH);
                    }
                    sb.append(segment);
                }
                uri = sb.toString();
                if (uri.length() == 0) {
                    uri = SLASH;
                }
                m = templateRegexPattern.matcher(uri);
                if (!m.matches()) {
                    return false;
                }
            } else {
                return false;
            }
        }

        // Assign the matched template values to template variables
        int groupCount = m.groupCount();

        int i = 1;
        for (String name : variables) {
            while (i <= groupCount) {
                String value = m.group(i++);
                if ((value == null || value.length() == 0 && i < groupCount)
                    && variables.size() + 1 < groupCount) {
                    continue;
                }
                templateVariableToValue.add(name, value);
                break;
            }
        }
        // The right hand side value, might be used to further resolve
        // sub-resources.

        String finalGroup = i > groupCount ? SLASH : m.group(groupCount);
        if (finalGroup == null || finalGroup.startsWith(SLASH_QUOTE)) {
            finalGroup = SLASH;
        }

        templateVariableToValue.putSingle(FINAL_MATCH_GROUP, finalGroup);

        return true;
    }
