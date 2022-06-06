public static <T> void forEachWithIndex(
            Iterable<T> iterable,
            ObjectIntProcedure<? super T> procedure)
    {
        FJIterate.forEachWithIndex(iterable, procedure, FJIterate.FORK_JOIN_POOL);
    }
