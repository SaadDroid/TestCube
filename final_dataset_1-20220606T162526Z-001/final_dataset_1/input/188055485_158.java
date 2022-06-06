@Override
    public CommonResult updateMedicineById(Medicine medicine) {
        if (medicineMapper.get(medicine.getId()) == null) {
            return CommonResult.fail(E_602);
        }
        int count = medicineMapper.update(medicine);
        if (count == 0) {
            return CommonResult.fail();
        }
        return CommonResult.success(count);
    }
