public static void postProcessTests(TestSuiteChromosome testSuite, List<TestFitnessFactory<? extends TestFitnessFunction>> fitnessFactories) {
        LOG.info("test size before post-process: {}",testSuite.size());
        if (Properties.INLINE) {
            ConstantInliner inliner = new ConstantInliner();
            inliner.inline(testSuite);
        }


        if (Properties.MINIMIZE) {
            double before = testSuite.getFitness();

            TestSuiteMinimizer minimizer = new TestSuiteMinimizer(fitnessFactories);

            LOG.info("* Minimizing test suite");
            minimizer.minimize(testSuite, true);

            double after = testSuite.getFitness();
            if (after > before + 0.01d) { // assume minimization
                throw new Error("EvoSuite bug: minimization lead fitness from " + before + " to " + after);
            }
        }
        LOG.info("test size after post-process: {}",testSuite.size());

        if (Properties.ASSERTIONS) {
            LOG.info("Generating assertions");
            TestSuiteGeneratorHelper.addAssertions(testSuite);
        }


        compileAndCheckTests(testSuite);
    }
