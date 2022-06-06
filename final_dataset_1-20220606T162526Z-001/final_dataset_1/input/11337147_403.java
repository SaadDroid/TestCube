protected Router buildRouter() {
        final Context context = getContext();
        final Router router = new Router(context);
        // WARNING: if you add a route you need to declare it in org.bonitasoft.web.rest.server.FinderFactory

        // GET an activityData:
        router.attach(BPM_ACTIVITY_VARIABLE_URL + "/{" + ActivityVariableResource.ACTIVITYDATA_ACTIVITY_ID + "}/{"
                + ActivityVariableResource.ACTIVITYDATA_DATA_NAME
                + "}", factory.create(ActivityVariableResource.class));

        // GET to search timer event triggers:
        router.attach(BPM_TIMER_EVENT_TRIGGER_URL, factory.create(TimerEventTriggerResource.class));
        // PUT to update timer event trigger date:
        router.attach(BPM_TIMER_EVENT_TRIGGER_URL + "/{" + TimerEventTriggerResource.ID_PARAM_NAME + "}", factory.create(TimerEventTriggerResource.class));

        // POST to send a BPM message to the engine:
        router.attach(BPM_MESSAGE_URL, factory.create(BPMMessageResource.class));

        // GET to case info (with task state counter)
        router.attach(BPM_CASE_INFO_URL + "/{" + CaseInfoResource.CASE_ID + "}", factory.create(CaseInfoResource.class));

        // GET to retrieve a case context:
        router.attach(BPM_CASE_CONTEXT_URL + "/{caseId}/context", factory.create(CaseContextResource.class));

        // GET to retrieve an archived case context
        router.attach(BPM_ARCHIVED_CASE_CONTEXT_URL + "/{archivedCaseId}/context", factory.create(ArchivedCaseContextResource.class));

        // GET a task contract:
        router.attach(BPM_USER_TASK_URL + "/{taskId}/contract", factory.create(UserTaskContractResource.class));
        // POST to execute a task with contract:
        router.attach(BPM_USER_TASK_URL + "/{taskId}/execution", factory.create(UserTaskExecutionResource.class));
        // GET to retrieve a task context:
        router.attach(BPM_USER_TASK_URL + "/{taskId}/context", factory.create(UserTaskContextResource.class));

        // GET an archived task context:
        router.attach(BPM_ARCHIVED_USER_TASK_URL + "/{archivedTaskId}/context", factory.create(ArchivedUserTaskContextResource.class));

        // GET a process defintion design :
        router.attach(BPM_PROCESS_URL + "/{processDefinitionId}/design", factory.create(ProcessDefinitionDesignResource.class));
        // GET a process contract:
        router.attach(BPM_PROCESS_URL + "/{processDefinitionId}/contract", factory.create(ProcessContractResource.class));
        // POST to instantiate a process with contract:
        router.attach(BPM_PROCESS_URL + "/{processDefinitionId}/instantiation", factory.create(ProcessInstantiationResource.class));

        // GET to search form mappings:
        router.attach(FORM_MAPPING_URL, factory.create(FormMappingResource.class));

        // GET the BDM status
        router.attach(BDM_DEFINITION_URL, factory.create(BusinessDataModelResource.class));
        
        //GET a BusinessData
        router.attach(BDM_BUSINESS_DATA_URL + "/{className}/findByIds", factory.create(BusinessDataFindByIdsResource.class));
        router.attach(BDM_BUSINESS_DATA_URL + "/{className}", factory.create(BusinessDataQueryResource.class));
        router.attach(BDM_BUSINESS_DATA_URL + "/{className}/{id}", factory.create(BusinessDataResource.class));
        router.attach(BDM_BUSINESS_DATA_URL + "/{className}/{id}/{fieldName}", factory.create(BusinessDataResource.class));

        // GET a Multiple BusinessDataReference
        router.attach(BDM_BUSINESS_DATA_REFERENCE_URL, factory.create(BusinessDataReferencesResource.class));
        // GET a Simple BusinessDataReference
        router.attach(BDM_BUSINESS_DATA_REFERENCE_URL + "/{caseId}/{dataName}", factory.create(BusinessDataReferenceResource.class));

        // api extension
        router.attach(ROUTER_EXTENSION_PREFIX, factory.createExtensionResource(), Template.MODE_STARTS_WITH);

        // GET all translations
        router.attach("/system/i18ntranslation", factory.create(I18nTanslationResource.class));

        return router;
    }
