public WarningDialogFragment build(WarningDialogFragment.DialogDelegate delegate,
                                       int message, int positiveMessageButton,
                                       int negativeMessageButton) {

        WarningDialogFragment wipeDataDialog = WarningDialogFragment.newInstance(
                message, positiveMessageButton, negativeMessageButton);
        wipeDataDialog.setDelegate(delegate);
        return wipeDataDialog;
    }
