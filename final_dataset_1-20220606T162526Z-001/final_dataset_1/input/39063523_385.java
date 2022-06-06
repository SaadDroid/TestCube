@SuppressLint("StringFormatMatches")
    public void populate(final RnRFormViewModel model) {
        switch (model.getType()) {
            case RnRFormViewModel.TYPE_MISSED_PERIOD:
                configHolder(model.getTitle(),
                        Html.fromHtml(context.getString(R.string.label_previous_period_missing)),
                        R.drawable.ic_description, R.color.color_draft_title, color_white);
                break;
            case RnRFormViewModel.TYPE_FIRST_MISSED_PERIOD:
                configHolder(model.getTitle(),
                        Html.fromHtml(context.getString(R.string.label_missed_period)),
                        R.drawable.ic_description, R.color.color_select_title, color_white);
                setupButton(model, context.getString(R.string.btn_select_close_period));
                setupButtonColor();
                break;
            case RnRFormViewModel.TYPE_CANNOT_DO_MONTHLY_INVENTORY:
                showCannotDoMonthlyInventory(model);
                break;
            case RnRFormViewModel.TYPE_UNCOMPLETE_INVENTORY_IN_CURRENT_PERIOD:
                configHolder(model.getTitle(),
                        Html.fromHtml(context.getString(R.string.label_uncompleted_physical_inventory_message, model.getName(), model.getName())),
                        R.drawable.ic_description, R.color.color_draft_title, color_white);
                setupButton(model, context.getString(R.string.btn_view_uncompleted_physical_inventory));
                break;
            case RnRFormViewModel.TYPE_INVENTORY_DONE:
            case RnRFormViewModel.TYPE_CLOSE_OF_PERIOD_SELECTED:
                populateRnrFormNotBeCreatedView(model);
                break;
            case RnRFormViewModel.TYPE_CREATED_BUT_UNCOMPLETED:
                configHolder(model.getTitle(),
                        Html.fromHtml(context.getString(R.string.label_incomplete_requisition, model.getName())),
                        R.drawable.ic_description, R.color.color_draft_title, color_white);
                setupButton(model, context.getString(R.string.btn_view_incomplete_requisition, model.getName()));
                break;
            case RnRFormViewModel.TYPE_UNSYNCED_HISTORICAL:
                populateRnrFormUnsyncedMessage(model);
                break;
            case RnRFormViewModel.TYPE_SYNCED_HISTORICAL:
                populateSyncedHistorical(model);
                break;
            case RnRFormViewModel.TYPE_INACTIVE:
                populateRnrFormInActiveCreatedView(model);
                break;
        }
    }
