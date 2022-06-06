public void stop() throws ArkRuntimeException {
        if (stopped.compareAndSet(false, true)) {
            LOGGER.info("Begin to stop ArkServiceContainer");

            ClassLoader oldClassLoader = ClassLoaderUtils.pushContextClassLoader(getClass()
                .getClassLoader());
            try {
                Collections.reverse(arkServiceList);
                for (ArkService arkService : arkServiceList) {
                    LOGGER.info(String.format("Dispose service: %s", arkService.getClass()
                        .getName()));
                    arkService.dispose();
                }
                LOGGER.info("Finish to stop ArkServiceContainer");
            } finally {
                ClassLoaderUtils.popContextClassLoader(oldClassLoader);
            }
        }
    }
