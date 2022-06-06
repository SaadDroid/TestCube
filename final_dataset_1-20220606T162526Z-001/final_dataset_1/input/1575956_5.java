@Override
    public void start(Configuration conf) {
        boolean httpEnabled = conf.getBoolean(PROMETHEUS_STATS_HTTP_ENABLE, DEFAULT_PROMETHEUS_STATS_HTTP_ENABLE);
        boolean bkHttpServerEnabled = conf.getBoolean("httpServerEnabled", false);
        // only start its own http server when prometheus http is enabled and bk http server is not enabled.
        if (httpEnabled && !bkHttpServerEnabled) {
            int httpPort = conf.getInt(PROMETHEUS_STATS_HTTP_PORT, DEFAULT_PROMETHEUS_STATS_HTTP_PORT);
            InetSocketAddress httpEndpoint = InetSocketAddress.createUnresolved("0.0.0.0", httpPort);
            this.server = new Server(httpEndpoint);
            ServletContextHandler context = new ServletContextHandler();
            context.setContextPath("/");
            server.setHandler(context);

            context.addServlet(new ServletHolder(new PrometheusServlet(this)), "/metrics");

            try {
                server.start();
                log.info("Started Prometheus stats endpoint at {}", httpEndpoint);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        // Include standard JVM stats
        registerMetrics(new StandardExports());
        registerMetrics(new MemoryPoolsExports());
        registerMetrics(new GarbageCollectorExports());
        registerMetrics(new ThreadExports());

        // Add direct memory allocated through unsafe
        registerMetrics(Gauge.build("jvm_memory_direct_bytes_used", "-").create().setChild(new Child() {
            @Override
            public double get() {
                return directMemoryUsage != null ? directMemoryUsage.longValue() : Double.NaN;
            }
        }));

        registerMetrics(Gauge.build("jvm_memory_direct_bytes_max", "-").create().setChild(new Child() {
            @Override
            public double get() {
                return PlatformDependent.maxDirectMemory();
            }
        }));

        executor = Executors.newSingleThreadScheduledExecutor(new DefaultThreadFactory("metrics"));

        int latencyRolloverSeconds = conf.getInt(PROMETHEUS_STATS_LATENCY_ROLLOVER_SECONDS,
                DEFAULT_PROMETHEUS_STATS_LATENCY_ROLLOVER_SECONDS);

        executor.scheduleAtFixedRate(() -> {
            rotateLatencyCollection();
        }, 1, latencyRolloverSeconds, TimeUnit.SECONDS);

    }
