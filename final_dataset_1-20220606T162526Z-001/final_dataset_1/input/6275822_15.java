public void run() {
        runner = newJsonRunnerWithSetting(
                globalSettings.stream()
                        .filter(byEnv(this.env))
                        .map(toRunnerSetting())
                        .collect(toList()), startArgs);
        runner.run();
    }
