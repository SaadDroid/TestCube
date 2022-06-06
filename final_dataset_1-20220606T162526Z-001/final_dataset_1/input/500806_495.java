public String execute(List<String> parameterList, TestContext context) {
        if (CollectionUtils.isEmpty(parameterList)) {
            throw new InvalidFunctionUsageException("Function parameters must not be empty");
        }

        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat dateFormat;
        String result = "";

        if (parameterList.size() > 2) {
            dateFormat = new SimpleDateFormat(parameterList.get(2));
        } else {
            dateFormat = getDefaultDateFormat();
        }

        try {
            calendar.setTime(dateFormat.parse(parameterList.get(0)));
        } catch (ParseException e) {
            throw new CitrusRuntimeException(e);
        }

        if (parameterList.size() > 1) {
            applyDateOffset(calendar, parameterList.get(1));
        }

        try {
            result = dateFormat.format(calendar.getTime());
        } catch (RuntimeException e) {
            log.error("Error while formatting dateParameter value ", e);
            throw new CitrusRuntimeException(e);
        }

        return result;
    }
