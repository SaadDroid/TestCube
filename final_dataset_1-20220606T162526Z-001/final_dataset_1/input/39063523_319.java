@Override
    public void refreshRequisitionForm(RnRForm form) {
        scrollView.setVisibility(View.VISIBLE);
        List<RegimenItemThreeLines> regimeTypes = form.getRegimenThreeLineListWrapper();
        rnrFormList.initView(form.getRnrFormItemListWrapper(), !(regimeTypes != null && !regimeTypes.isEmpty()));
        if (regimeTypes != null && !regimeTypes.isEmpty()) {
            mmiaRegimeThreeLineListView.initView(mmiaRegimeThreeLineTotal, mmiaRegimeThreeLinePharmacy, regimeTypes);
        } else {
            mmiaThreaPeuticLayout.setVisibility(View.GONE);
            tvRegimeTotalPharmacy.setVisibility(View.GONE);
            tvTotalPharmacyTitle.setVisibility(View.GONE);
        }
        regimeWrap.initView(tvRegimeTotal, tvRegimeTotalPharmacy, tvTotalPharmacyTitle, presenter);
        mmiaPatientInfoListView.initView(form.getBaseInfoItemListWrapper());
        InflateFreezeHeaderView();
        getActivity().setTitle(getString(R.string.label_mmia_title, DateUtil.formatDateWithoutYear(form.getPeriodBegin()), DateUtil.formatDateWithoutYear(form.getPeriodEnd())));
        etComment.setText(form.getComments());
        highlightTotalDifference();
        bindListeners();
    }
