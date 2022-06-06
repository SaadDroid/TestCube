public void validate(Object target, Errors errors) {
        List list = (List) target;
        for (int i = 0; i < list.size(); i++) {
            MapLink link = (MapLink) list.get(i);
            validateParentMap(link, i, errors);
            validateChildMap(link, i, errors);

            if (link.getParentMap() != null && link.getChildMap() != null) {
                if (link.getParentMap().getId() == link.getChildMap().getId()) {
                    errors.rejectValue(String.format("[%s].childMap", i), "Map can not link to itself");
                }
            }

            isNotNull(link.getRelationshipType(), String.format("[%s].relationshipType", i), "Relationship Type", errors);

            if (link.getComment() != null && link.getComment().length() > 255) {
                errors.rejectValue(String.format("[%s].comment", i), "Comment can't be longer than 255 characters");
            }
        }

    }
