public void convertRnrKitItemsToViaKit(List<RnrFormItem> rnrKitItems) {
        kitItems = rnrKitItems;

        for (RnrFormItem rnrKitItem : rnrKitItems) {

            if (US_KIT.equals(rnrKitItem.getProduct().getCode())) {
                if (rnrKitItem.getReceived() > Long.MIN_VALUE) {
                    kitsReceivedHF = String.valueOf(rnrKitItem.getReceived());
                }

                if (rnrKitItem.getIssued() > Long.MIN_VALUE) {
                    kitsOpenedHF = String.valueOf(rnrKitItem.getIssued());
                }
            } else if (APE_KIT.equals(rnrKitItem.getProduct().getCode())) {
                if (rnrKitItem.getReceived() > Long.MIN_VALUE) {
                    kitsReceivedCHW = String.valueOf(rnrKitItem.getReceived());
                }

                if (rnrKitItem.getIssued() > Long.MIN_VALUE) {
                    kitsOpenedCHW = String.valueOf(rnrKitItem.getIssued());
                }
            }
        }
    }
