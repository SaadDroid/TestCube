@Override
    public CommonResult listAllNonMedicines() {
        List<NonMedicine> list = nonMedicineMapper.list();
        return CommonResult.success(list);
    }
