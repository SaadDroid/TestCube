public static int toTensorIndex(final int[] indices, final int[] dimensions) {
    Validate.notNull(indices, "indices");
    Validate.notNull(dimensions, "dimensions");
    final int dim = indices.length;
    Validate.isTrue(dim == dimensions.length);
    int sum = 0;
    int product = 1;
    for (int i = 0; i < dim; i++) {
      Validate.isTrue(indices[i] < dimensions[i], "index out of bounds");
      sum += indices[i] * product;
      product *= dimensions[i];
    }
    return sum;
  }
