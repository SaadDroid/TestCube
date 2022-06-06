public static int generatePathIdRandomIncrements() {
        int pathid;
        int count = num_pathid;

        do {
            next_pathid = next_pathid + (randomGenerator.nextInt(num_pathid) % N) + 1;
            pathid = MIN_PATH_ID + (next_pathid % num_pathid);

            if (check_suitable_pathid(pathid)) {
                return pathid;
            }

            count--;
        } while (count > 0);

        return -1;
    }
