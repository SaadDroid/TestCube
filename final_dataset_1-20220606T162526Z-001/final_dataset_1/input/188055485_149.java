@Override
    public CommonResult deleteNonMedicineById(Integer id) {
        if (nonMedicineMapper.get(id) == null) {
            return CommonResult.fail(E_602);
        }
        int count = nonMedicineMapper.delete(id);
        if (count == 0) {
            return CommonResult.fail();
        }
        return CommonResult.success(count);
    }
