public static byte[][] inferBoundaries(TreeMap<byte[], Integer> bdryMap) {
    ArrayList<byte[]> keysArray = new ArrayList<byte[]>();
    int runningValue = 0;
    byte[] currStartKey = null;
    boolean firstBoundary = true;

    for (Map.Entry<byte[], Integer> item: bdryMap.entrySet()) {
      if (runningValue == 0) currStartKey = item.getKey();
      runningValue += item.getValue();
      if (runningValue == 0) {
        if (!firstBoundary) keysArray.add(currStartKey);
        firstBoundary = false;
      }
    }

    return keysArray.toArray(new byte[0][0]);
  }
