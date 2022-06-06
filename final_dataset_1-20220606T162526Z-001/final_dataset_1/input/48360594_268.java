public Map<String, List<String>> checkConflictRuleValid() {
        Map<String, List<String>> returnMap = new HashMap<>();
        List<String> ruleColumnList = new ArrayList<>();
        List<Column> executeOrder = new ArrayList<>();
        Map<String, List<String>> cycDepenStatus = new HashMap<>();
        for (RuleDefinition ruleDef : this.getRuleDefinitionList()) {
            ruleColumnList.add(ruleDef.getTargetColumn());
        }
        for (Column col : this.getColumnList()) {
            String conflictTargetColumnName = col.getName();
            for (ConflictRuleDefinition conRuleDef : col.getConflictResolveList()) {

                if (!ruleColumnList.contains(conflictTargetColumnName)) {
                    List<String> messageList = returnMap.get(conflictTargetColumnName);
                    if (messageList == null) {
                        messageList = new ArrayList<>();
                        returnMap.put(conflictTargetColumnName, messageList);
                    }
                    String errorMessage = conflictTargetColumnName + " does not contain any survived value"; //$NON-NLS-1$
                    if (!messageList.contains(errorMessage)) {
                        messageList.add(errorMessage);
                    }
                }
                if (Function.SurviveAs == conRuleDef.getFunction()) {
                    String conflictRefColumnName = conRuleDef.getReferenceColumn();
                    if (!ruleColumnList.contains(conflictRefColumnName)) {
                        List<String> messageList = returnMap.get(conflictRefColumnName);
                        if (messageList == null) {
                            messageList = new ArrayList<>();
                            returnMap.put(conflictRefColumnName, messageList);
                        }
                        String errorMessage = conflictRefColumnName + " does not contain any survived value"; //$NON-NLS-1$
                        if (!messageList.contains(errorMessage)) {
                            messageList.add(errorMessage);
                        }
                    }
                    if (cycDepenStatus.get(conflictTargetColumnName) == null) {
                        cycDepenStatus.put(conflictTargetColumnName, new ArrayList<String>());
                    }
                    boolean checkCycDependency = checkCycDependency(conflictTargetColumnName, conflictRefColumnName,
                            executeOrder, cycDepenStatus);
                    if (!checkCycDependency) {
                        List<String> messageList = returnMap.get(conflictRefColumnName);
                        if (messageList == null) {
                            messageList = new ArrayList<>();
                            returnMap.put(conflictRefColumnName, messageList);
                        }
                        String errorMessage =
                                conflictTargetColumnName + " cannot be survived as " + conflictRefColumnName //$NON-NLS-1$
                                        + " because of circular dependency"; //$NON-NLS-1$
                        if (!messageList.contains(errorMessage)) {
                            messageList.add(errorMessage);
                        }
                    }
                    break;
                }
            }
        }
        if (returnMap.size() == 0) {
            this.getDataSet().setColumnOrder(fillOtherColumn(executeOrder));
        }
        return returnMap;
    }
