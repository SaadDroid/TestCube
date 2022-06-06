public Map<String, Serializable> getProcessedInput(final ContractDefinition processContract, final Map<String, Serializable> inputs,
            final long maxSizeForTenant, final long tenantId) throws FileNotFoundException {
        this.maxSizeForTenant = maxSizeForTenant;
        this.tenantId = tenantId;
        final Map<String, Serializable> processedInputs = new HashMap<>();
        final Map<String, Serializable> contractDefinitionMap = processContract == null ? Collections.<String, Serializable> emptyMap()
                : createContractInputMap(processContract.getInputs());
        if (inputs != null) {
            for (final Entry<String, Serializable> inputEntry : inputs.entrySet()) {
                processedInputs.put(inputEntry.getKey(),
                        convertInputToExpectedType(inputEntry.getValue(),
                                contractDefinitionMap.get(inputEntry.getKey())));
            }
        }
        return processedInputs;
    }
