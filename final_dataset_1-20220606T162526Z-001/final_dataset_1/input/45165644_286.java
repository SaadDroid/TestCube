public static void main(String[] args) {
        int counterDateValues = 0;
        int counterExceptions = 0;

        // Create a callable
        DateFormatCallable callableDf = new DateFormatCallable("dd/MM/yyyy", "15/12/2015");
        // start 4 threads, each using the same Callable instance
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Result> futureResult1 = executor.submit(callableDf);
        Future<Result> futureResult2 = executor.submit(callableDf);
        Future<Result> futureResult3 = executor.submit(callableDf);
        Future<Result> futureResult4 = executor.submit(callableDf);
        try {
            Result[] result = new Result[4];
            result[0] = futureResult1.get();
            result[1] = futureResult2.get();
            result[2] = futureResult3.get();
            result[3] = futureResult4.get();

            // Print results of thread executions (converted dates and raised exceptions)
            // and count them
            for (int i = 0; i < result.length; i++) {
                counterDateValues = counterDateValues + printAndCountDates(result[i]);
                counterExceptions = counterExceptions + printAndCountExceptions(result[i]);
            }

            // a correct run should deliver 20 times 15.12.2015
            // and a correct run shouldn't deliver any exception
            System.out.println("The List dateList contains " + counterDateValues + " date values");
            System.out.println("The List exceptionList contains " + counterExceptions + " exceptions");

        } catch (Exception e) {
            System.out.println("Abnormal end of program. Program throws exception: " + e);
        }
        executor.shutdown();
    }