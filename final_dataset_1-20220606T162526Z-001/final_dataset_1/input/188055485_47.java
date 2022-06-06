public CommonResult insertTransactionLog(CollectionParam collectionParam, ProjectParam projectParam,
                                             ItemParam itemParam, Integer creatorRoleId){
        Integer registrationId = collectionParam.getCaseId();
        Integer patientId = patientCaseMapper.getPatientIdByCaseId(registrationId);
        if(patientId == null)
            return CommonResult.fail(ResultCode.E_800);
        Integer typeInt = collectionParam.getCollectionType();
        String type;
        if(typeInt == 1)
            type = "检查费";
        else if(typeInt == 2)
            type = "检验费";
        else if(typeInt == 3)
            type = "处置费";
        else
            return CommonResult.fail(ResultCode.E_801);
        Integer collectionId = collectionParam.getCollectionId();
        Integer projectId = projectParam.getProjectId();
        String projectName = projectParam.getProjectName();
        String itemId;
        String itemName = "";
        BigDecimal price;
        Short amount;
        BigDecimal totalMoney; //计算总金额
        if(typeInt == 1 || typeInt == 2) {
            itemId = itemParam.getItemId();
            itemName = itemParam.getItemName();
            price = techProjectMapper.getPriceByItemId(itemId);
            amount = itemParam.getAmount();
            totalMoney = new BigDecimal(amount).multiply(price);
        }
        else{
            price = techProjectMapper.getPriceByProjectId(projectId);
            totalMoney = price;
            itemId = null;
            amount = 1;
        }

        //创建transactionLog对象
        TransactionLog transactionLog = new TransactionLog();
//        transactionLog.setInvoiceCode(newInvoiceCode);
        transactionLog.setRegistrationId(registrationId);
        transactionLog.setPatientId(patientId);
        transactionLog.setType(type);
        transactionLog.setCollectionId(collectionId);
        transactionLog.setProjectId(projectId);
        transactionLog.setRoleId(creatorRoleId);
        transactionLog.setProjectName(projectName);
        transactionLog.setItemId(itemId);
        transactionLog.setItemName(itemName);
        transactionLog.setAmount(amount);
        transactionLog.setTotalMoney(totalMoney);

        //增加缴费清单
        return transactionService.insertTransactionLog(transactionLog);
    }
