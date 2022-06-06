public int[] downloadFormTemplates(String[] formIds, boolean replaceExistingTemplates) {
        int[] result = new int[4];

        try {
            List<FormTemplate> formTemplates = formController.downloadFormTemplates(formIds);
            formTemplates.removeAll(Collections.singleton(null));
            Log.i(getClass().getSimpleName(), formTemplates.size() + " form template download successful");

            if (replaceExistingTemplates) {
                formController.replaceFormTemplates(formTemplates);
            } else {
                formController.saveFormTemplates(formTemplates);
            }

            Log.i(getClass().getSimpleName(), "Form templates replaced");

            result[0] = SUCCESS;
            result[1] = formTemplates.size();
        } catch (FormController.FormSaveException e) {
            Log.e(getClass().getSimpleName(), "Exception when trying to save forms", e);
            result[0] = SyncStatusConstants.SAVE_ERROR;
            return result;
        } catch (FormController.FormFetchException e) {
            Log.e(getClass().getSimpleName(), "Exception when trying to download forms", e);
            result[0] = SyncStatusConstants.DOWNLOAD_ERROR;
            return result;
        }
        return result;
    }
