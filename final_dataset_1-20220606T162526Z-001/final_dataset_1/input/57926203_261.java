public SbRestSfstTask(RestOperation restOperation, ServiceFunctionSchedulerType dataObject, ExecutorService odlExecutor) {
        super(restOperation, odlExecutor);
        this.exporterFactory = new SfstExporterFactory();
        if (restOperation.equals(RestOperation.DELETE)) {
            this.jsonObject = exporterFactory.getExporter().exportJsonNameOnly(dataObject);
        } else {
            this.jsonObject = exporterFactory.getExporter().exportJson(dataObject);
        }
        setRestUriList(dataObject);
    }
