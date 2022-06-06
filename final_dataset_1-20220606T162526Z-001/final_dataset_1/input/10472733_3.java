public void sortByDate() {
        Collections.sort(this, new Comparator<EncounterWithObservations>() {
            @Override
            public int compare(EncounterWithObservations lhs, EncounterWithObservations rhs) {
                if (lhs.getEncounter().getEncounterDatetime()==null)
                    return -1;
                if (rhs.getEncounter().getEncounterDatetime()==null)
                    return 1;
                return -(lhs.getEncounter().getEncounterDatetime()
                        .compareTo(rhs.getEncounter().getEncounterDatetime()));
            }
        });

    }
