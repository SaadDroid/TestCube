@Override
    public DLRPayload parseMessage(String message) {
        //"id:XXXXXXXXXX sub:001 dlvrd:000 submit date:YYMMDDHHMM done date:YYMMDDHHMM stat:ZZZZZZZ err:YYY text:none
        DLRPayload dlr = new DLRPayload();

        final String messageId = parseTagValue(message, ID_TAG);
        dlr.setId(messageId);

        final String submit_date = parseTagValue(message, SUBMIT_TAG);
        DateTime parsedDate = parseDate(submit_date);
        dlr.setSubmitDate(parsedDate);

        final String done_date = parseTagValue(message, DONE_TAG);
        DateTime doneDate = parseDate(done_date);
        dlr.setDoneDate(doneDate);

        final String stat = parseTagValue(message, STAT_TAG);
        Status parsedStatus = parseRestcommStatus(stat);
        dlr.setStat(parsedStatus);

        final String err = parseTagValue(message, ERR_TAG);
        MessageError parsedError = parseRestcommErrorCode(err);
        dlr.setErr(parsedError);

        final String sub = parseTagValue(message, SUB_TAG);
        dlr.setSub(sub);

        final String dlv = parseTagValue(message, DLVRD_TAG);
        dlr.setDlvrd(dlv);

        if (logger.isDebugEnabled()) {
            logger.debug("Parsed DLR is:" + dlr);
        }
        return dlr;
    }
