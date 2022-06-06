public List<org.androidtransfuse.model.manifest.IntentFilter> buildIntentFilters(ASTType astType) {

        IntentFilters intentFilters = astType.getAnnotation(IntentFilters.class);
        IntentFilter intentFilter = astType.getAnnotation(IntentFilter.class);
        Intent intent = astType.getAnnotation(Intent.class);
        Data data = astType.getAnnotation(Data.class);

        List<org.androidtransfuse.model.manifest.IntentFilter> convertedIntentFilters = new ArrayList<org.androidtransfuse.model.manifest.IntentFilter>();

        if(intentFilters != null){
            for (IntentFilter filter : intentFilters.value()) {
                convertedIntentFilters.add(convertIntentFilter(filter));
            }
        }

        org.androidtransfuse.model.manifest.IntentFilter resultIntentFilter = null;
        if (intentFilter != null) {
            resultIntentFilter = convertIntentFilter(intentFilter);
            convertedIntentFilters.add(resultIntentFilter);
        }
        if (intent != null) {
            if (resultIntentFilter == null) {
                resultIntentFilter = intentFilterProvider.get();
                convertedIntentFilters.add(resultIntentFilter);
            }

            addIntent(intent, resultIntentFilter);
        }
        if(data != null){
            if(resultIntentFilter == null){
                resultIntentFilter = intentFilterProvider.get();
                convertedIntentFilters.add(resultIntentFilter);
            }
            addData(data, resultIntentFilter);
        }

        return convertedIntentFilters;
    }
