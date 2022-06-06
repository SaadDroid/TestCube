public SbRestSfstateTask(RestOperation restOperation, ServiceFunctionState dataObject, ExecutorService odlExecutor) {
        super(restOperation, odlExecutor);
        this.exporterFactory = new SfstateExporterFactory();
        if (restOperation.equals(RestOperation.DELETE)) {
            this.jsonObject = exporterFactory.getExporter().exportJsonNameOnly(dataObject);
        } else {
            this.jsonObject = exporterFactory.getExporter().exportJson(dataObject);
        }
        setRestUriList(dataObject);
    }
