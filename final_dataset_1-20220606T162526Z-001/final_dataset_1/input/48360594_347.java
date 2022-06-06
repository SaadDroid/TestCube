@Override
    public void onMatch(Record record1, Record record2, MatchResult matchResult) {

        // record1 and record2 must be RichRecord from DQ grouping implementation.
        RichRecord richRecord1 = (RichRecord) record1;
        RichRecord richRecord2 = (RichRecord) record2;

        richRecord1.setConfidence(richRecord1.getScore());
        richRecord2.setConfidence(richRecord2.getScore());

        String grpId1 = richRecord1.getGroupId();
        String grpId2 = richRecord2.getGroupId();
        if (grpId1 == null && grpId2 == null) {
            // Both records are original records.
            String gid = UUID.randomUUID().toString(); // Generate a new GID.
            richRecord1.setGroupId(gid);
            richRecord2.setGroupId(gid);
            // group size is 0 for none-master record
            richRecord1.setGrpSize(0);
            richRecord2.setGrpSize(0);

            richRecord1.setMaster(false);
            richRecord2.setMaster(false);

            output(richRecord1);
            output(richRecord2);

        } else if (grpId1 != null && grpId2 != null) {
            // Both records are merged records.
            richRecord2.setGroupId(grpId1);
            // Put into the map: <gid2,gid1>
            oldGID2New.put(grpId2, grpId1);
            // Update map where value equals to gid2
            List<String> keysOfGID2 = oldGID2New.getKeys(grpId2);
            if (keysOfGID2 != null) {
                for (String key : keysOfGID2) {
                    oldGID2New.put(key, grpId1);
                }
            }

        } else if (grpId1 == null) {
            // richRecord1 is original record
            // GID is the gid of record 2.
            richRecord1.setGroupId(richRecord2.getGroupId());
            // group size is 0 for none-master record
            richRecord1.setGrpSize(0);
            richRecord1.setMaster(false);

            output(richRecord1);

        } else {
            // richRecord2 is original record.
            // GID
            richRecord2.setGroupId(richRecord1.getGroupId());
            // group size is 0 for none-master record
            richRecord2.setGrpSize(0);
            richRecord2.setMaster(false);

            output(richRecord2);
        }
    }
