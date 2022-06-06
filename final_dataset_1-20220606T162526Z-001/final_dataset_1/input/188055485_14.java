@Override
    public CommonResult doctorStatisticsByUserIdAndDate(String dateStr, Integer userId){
        JSONObject jsonObject = new JSONObject();
        String pastSevenDays = getPastDate(7, dateStr, false);
        String pastThirtyDays = getPastDate(1, dateStr, true);
        System.out.println("过去七天：" + pastSevenDays);
        System.out.println("过去一个月：" + pastThirtyDays);
        //当天
        List<HashMap> currentDayResult = convertMapForIndividualDoctor(transactionLogMapper.calculateClinicianDoctorTotalMoney(userId, dateStr, dateStr));
        List<HashMap> currentDayVisits = transactionLogMapper.countClinicianDoctorVisits(userId, dateStr, dateStr);
        List<HashMap> currentDayInvoices = transactionLogMapper.countClinicianDoctorInvoices(userId, dateStr, dateStr);
        jsonObject.put("currentDay", addInvoicesAndVisitsForIndividualDoctor(currentDayResult, currentDayInvoices, currentDayVisits));

        //一周
        List<HashMap> sevenDaysResult = convertMapForIndividualDoctor(transactionLogMapper.calculateClinicianDoctorTotalMoney(userId, pastSevenDays, dateStr));
        List<HashMap> sevenDaysVisits = transactionLogMapper.countClinicianDoctorVisits(userId, pastSevenDays, dateStr);
        List<HashMap> sevenDaysInvoices = transactionLogMapper.countClinicianDoctorInvoices(userId, pastSevenDays, dateStr);
        jsonObject.put("sevenDays", addInvoicesAndVisitsForIndividualDoctor(sevenDaysResult, sevenDaysInvoices, sevenDaysVisits));

        //一个月
        List<HashMap> thirtyDaysResult = convertMapForIndividualDoctor(transactionLogMapper.calculateClinicianDoctorTotalMoney(userId, pastThirtyDays, dateStr));
        List<HashMap> thirtyDaysVisits = transactionLogMapper.countClinicianDoctorVisits(userId, pastThirtyDays, dateStr);
        List<HashMap> thirtyDaysInvoices = transactionLogMapper.countClinicianDoctorInvoices(userId, pastThirtyDays, dateStr);
        jsonObject.put("thirtyDays", addInvoicesAndVisitsForIndividualDoctor(thirtyDaysResult, thirtyDaysInvoices, thirtyDaysVisits));

        return CommonResult.success(jsonObject);
    }
