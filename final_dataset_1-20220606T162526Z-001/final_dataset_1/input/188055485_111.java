@Override
    public CommonResult deleteDiseaseById(Short id) {
        if (diseaseMapper.get(id) == null) {
            return CommonResult.fail(E_602);
        }
        int count = diseaseMapper.delete(id);
        if (count == 0) {
            return CommonResult.fail();
        }
        return CommonResult.success(count);
    }
