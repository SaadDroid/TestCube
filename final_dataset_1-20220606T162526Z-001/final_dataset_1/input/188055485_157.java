@Override
    public CommonResult insertMedicine(Medicine medicine) {
        int count = medicineMapper.insert(medicine);
        if (count == 0) {
            return CommonResult.fail();
        }
        return CommonResult.success(count);
    }
