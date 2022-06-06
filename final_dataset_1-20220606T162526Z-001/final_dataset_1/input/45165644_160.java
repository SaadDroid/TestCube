public boolean checkIfYouWillBeHanged(List<Royalty> tableGuests) {
        boolean anotherDay = true;
        for (Royalty r : tableGuests) {
            if (!r.getMood()) {
                anotherDay = false;
            }
        }

        return anotherDay;
    }
