@Override
    public String transformName(String oldName) {
        if (StringUtils.isEmpty(oldName)) {
            return oldName;
        } else if (isSimpleName(oldName)) {
            return oldName;
        } else {
            String newName = namesMapping.get(oldName);
            if (newName == null) {
                newName = toSimpleName(oldName);
                if (!newName.equals(oldName)) {
                    // Check for duplicates
                    boolean isDuplicate = false;
                    for(String key: namesMapping.keys()) {
                        if (!key.equals(oldName) && newName.equals(namesMapping.get(key))) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (isDuplicate) {
                        newName = newName + "_" + ++counter;
                    }
                    namesMapping.put(oldName, newName);
                }
            }

            return newName;
        }
    }
