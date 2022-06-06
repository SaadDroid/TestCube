@Transactional(rollbackFor = RuntimeException.class)
    public Result delete(int id) {
        Result result = new Result();
        
        udfFuncMapper.deleteById(id);
        udfUserMapper.deleteByUdfFuncId(id);
        putMsg(result, Status.SUCCESS);
        return result;
    }
