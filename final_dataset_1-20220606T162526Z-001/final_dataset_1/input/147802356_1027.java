public static Bytes32 merkleize(List<Bytes32> chunks, long limit) {
    int count = chunks.size();
    if (limit == 0) return zerohashes.get(0);

    int depth = Long.SIZE - Long.numberOfLeadingZeros(max(count - 1, 0));
    int max_depth = Long.SIZE - Long.numberOfLeadingZeros(limit - 1);
    List<Bytes32> tmp = new ArrayList<>();
    IntStream.range(0, max_depth + 1).boxed().forEach(i -> tmp.add(null));

    IntStream.range(0, count).forEach(i -> merge(chunks.get(i), i, tmp, count, depth));

    if ((1 << depth) != count) {
      merge(zerohashes.get(0), count, tmp, count, depth);
    }

    IntStream.range(depth, max_depth)
        .forEach(
            j -> tmp.set(j + 1, Hash.sha2_256(Bytes.concatenate(tmp.get(j), zerohashes.get(j)))));

    return tmp.get(max_depth);
  }
