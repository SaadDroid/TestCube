public Map<String, Object> updateUdfFunc(int udfFuncId,
                                             String funcName,
                                             String className,
                                             String argTypes,
                                             String database,
                                             String desc,
                                             UdfType type,
                                             int resourceId) {
        Map<String, Object> result = new HashMap<>();
        // verify udfFunc is exist
        UdfFunc udf = udfFuncMapper.selectUdfById(udfFuncId);

        if (udf == null) {
            result.put(Constants.STATUS, Status.UDF_FUNCTION_NOT_EXIST);
            result.put(Constants.MSG, Status.UDF_FUNCTION_NOT_EXIST.getMsg());
            return result;
        }

        // if resource upload startup
        if (!PropertyUtils.getResUploadStartupState()){
            logger.error("resource upload startup state: {}", PropertyUtils.getResUploadStartupState());
            putMsg(result, Status.HDFS_NOT_STARTUP);
            return result;
        }

        // verify udfFuncName is exist
        if (!funcName.equals(udf.getFuncName())) {
            if (checkUdfFuncNameExists(funcName)) {
                logger.error("UdfFunc {} has exist, can't create again.", funcName);
                result.put(Constants.STATUS, Status.UDF_FUNCTION_EXISTS);
                result.put(Constants.MSG, Status.UDF_FUNCTION_EXISTS.getMsg());
                return result;
            }
        }

        Resource resource = resourceMapper.selectById(resourceId);
        if (resource == null) {
            logger.error("resourceId {} is not exist", resourceId);
            result.put(Constants.STATUS, Status.RESOURCE_NOT_EXIST);
            result.put(Constants.MSG, Status.RESOURCE_NOT_EXIST.getMsg());
            return result;
        }
        Date now = new Date();
        udf.setFuncName(funcName);
        udf.setClassName(className);
        udf.setArgTypes(argTypes);
        if (StringUtils.isNotEmpty(database)) {
            udf.setDatabase(database);
        }
        udf.setDescription(desc);
        udf.setResourceId(resourceId);
        udf.setResourceName(resource.getFullName());
        udf.setType(type);

        udf.setUpdateTime(now);

        udfFuncMapper.updateById(udf);
        putMsg(result, Status.SUCCESS);
        return result;
    }
