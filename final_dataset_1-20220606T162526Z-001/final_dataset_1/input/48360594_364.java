@Override
    protected Record createNewRecord(Record record1, Record record2, long mergedRecordTimestamp) {
        RichRecord richRecord1 = (RichRecord) record1;
        RichRecord richRecord2 = (RichRecord) record2;
        RichRecord mergedRecord = new RichRecord(record1.getId(), mergedRecordTimestamp, mergedRecordSource);
        DQAttribute<?>[] mergedRows =
                richRecord1.getOriginRow().toArray(new DQAttribute<?>[richRecord1.getOriginRow().size()]);

        // Merge columns which are not maching keys using default survior rules.
        List<Attribute> matchingAttributes = record1.getAttributes();
        for (int colIdx = 0; colIdx < richRecord1.getOriginRow().size(); colIdx++) {
            boolean isMatchKeyIndex = false;
            for (Attribute attribute : matchingAttributes) {
                if (attribute.getColumnIndex() == colIdx) {
                    isMatchKeyIndex = true;
                    break;
                }
            }
            // added merge function for all columns which don't contain survivorship function
            if (!isMatchKeyIndex) {
                Map<Integer, SurvivorshipFunction> defaultSurvivorshipFuncs =
                        matchMergeParam.getDefaultSurviorshipRules();
                SurvivorshipFunction survivorshipFunc = defaultSurvivorshipFuncs.get(colIdx);
                if (survivorshipFunc == null || survivorshipFunc.getSurvivorShipAlgoEnum() == null) {
                    // No default survivorship function was set.
                    continue;
                }

                // attributes which are not matching keys
                // Keep values from original records (if any)
                String leftValue = richRecord1.getOriginRow().get(colIdx).getValue();
                String rightValue = richRecord2.getOriginRow().get(colIdx).getValue();
                Integer referenceColumnIndex = survivorshipFunc.getReferenceColumnIndex();
                // Get the merged value and update the merged row.
                mergedRows[colIdx] = new DQAttribute<>(StringUtils.EMPTY, colIdx, leftValue,
                        referenceColumnIndex == null ? colIdx : referenceColumnIndex.intValue());// No
                // label
                // for
                // the
                AttributeValues<String> leftValues = richRecord1.getOriginRow().get(colIdx).getValues();
                if (leftValues.size() > 0) {
                    mergedRows[colIdx].getValues().merge(leftValues);
                } else {
                    mergedRows[colIdx].getValues().get(leftValue).increment();
                }
                AttributeValues<String> rightValues = richRecord2.getOriginRow().get(colIdx).getValues();
                if (rightValues.size() > 0) {
                    mergedRows[colIdx].getValues().merge(rightValues);
                } else {
                    mergedRows[colIdx].getValues().get(rightValue).increment();
                }
                // Merge values
                if (leftValue == null && rightValue == null) {
                    mergedRows[colIdx].setValue(null);
                } else {
                    SurvivorShipAlgorithmEnum survAlgo = survivorshipFunc.getSurvivorShipAlgoEnum();
                    String parameter = survivorshipFunc.getParameter();
                    String mergedValue = null;
                    String mergedCompareValue = null;
                    switch (survAlgo) {
                    case MOST_RECENT:
                    case MOST_ANCIENT:
                        String leftCompareValue = leftValue;
                        String rightCompareValue = rightValue;

                        if (referenceColumnIndex != null && !referenceColumnIndex.equals(colIdx)
                                && (datePatternMap == null
                                        || datePatternMap.get(referenceColumnIndex.toString()) != null)) {
                            leftCompareValue = richRecord1.getOriginRow().get(colIdx).getReferenceValue();
                            rightCompareValue = richRecord2.getOriginRow().get(colIdx).getReferenceValue();
                            leftCompareValue = leftCompareValue == null
                                    ? richRecord1.getOriginRow().get(referenceColumnIndex).getValue()
                                    : leftCompareValue;
                            rightCompareValue = rightCompareValue == null
                                    ? richRecord2.getOriginRow().get(referenceColumnIndex).getValue()
                                    : rightCompareValue;
                        } else {
                            referenceColumnIndex = colIdx;
                        }
                        mergedCompareValue = compareAsDate(leftCompareValue, rightCompareValue, survAlgo,
                                String.valueOf(referenceColumnIndex), record1.getTimestamp(), record2.getTimestamp());
                        if (mergedCompareValue != null) {
                            if (mergedCompareValue.equals(leftCompareValue)) {
                                mergedValue = leftValue;
                            } else {
                                mergedValue = rightValue;
                            }
                        }
                        break;
                    default:
                        mergedValue = createMergeValue(record1.getSource(), record2.getSource(), parameter,
                                record1.getTimestamp(), record2.getTimestamp(), survAlgo, leftValue, rightValue,
                                mergedRows[colIdx].getValue(), mergedRows[colIdx].getValues());
                        break;
                    }
                    if (mergedValue != null) {
                        mergedRows[colIdx].setValue(mergedValue);
                        mergedRows[colIdx].setReferenceValue(mergedCompareValue);
                    }
                }

            }
            /**
             * Else the matching key's value will be udpated when call {@link RichRecord#getOutputRow()}
             */

        }
        List<DQAttribute<?>> originalRowList = new ArrayList<DQAttribute<?>>();
        CollectionUtils.addAll(originalRowList, mergedRows);
        mergedRecord.setRecordSize(richRecord1.getRecordSize());
        mergedRecord.setOriginRow(originalRowList);
        // Set the group quality
        double minQuality = getGrpqualityMinValue(richRecord1, richRecord2);

        if (Double.compare(minQuality, 0.0) != 0) {
            mergedRecord.setGroupQuality(minQuality);
        }
        // Added TDQ-12659: only when the GRP_SIZE is not null( = multipass), need to modify the group size
        if (richRecord1.getGRP_SIZE() != null && richRecord2.getGRP_SIZE() != null) {
            int newSize = Integer.valueOf(richRecord1.getGRP_SIZE().getValue())
                    + Integer.valueOf(richRecord2.getGRP_SIZE().getValue());
            if (newSize > 0) {
                mergedRecord.setGRP_SIZE(newSize);
            }
        }
        return mergedRecord;
    }
