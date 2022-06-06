@Override
    public CommonResult updateNonMedicineById(NonMedicine nonMedicine) {
        if (nonMedicineMapper.get(nonMedicine.getId()) == null) {
            return CommonResult.fail(E_602);
        }
        int count = nonMedicineMapper.update(nonMedicine);
        if (count == 0) {
            return CommonResult.fail();
        }
        return CommonResult.success(count);
    }
