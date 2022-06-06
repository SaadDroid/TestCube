@Override
    public Result execute() {
        FormattingResultLog resultLog = new FormattingResultLog();
        int inactiveBundles = 0;
        Bundle[] bundles = bundleContext.getBundles();

        for (Bundle bundle : bundles) {
            if ((!isActiveBundle(bundle)) && !isIgnoredBundle(bundle)) {
                inactiveBundles++;
                resultLog.warn("Bundle {} is not active. It is in state {}.", bundle.getSymbolicName(), bundle.getState());
            }
        }

        if (ignoredBundles != null) {
            resultLog.debug("The following bundles will be ignored: {}", Arrays.toString(ignoredBundles));
        }

        if (inactiveBundles > 0) {
            resultLog.warn("There are {} inactive Bundles", inactiveBundles);
        } else {
            resultLog.info("All bundles are considered active");
        }

        return new Result(resultLog);
    }
