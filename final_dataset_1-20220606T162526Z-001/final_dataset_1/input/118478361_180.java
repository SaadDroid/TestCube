public List<DRGElementReference<TInputData>> directInputDatas(TDRGElement parent) {
        List<DRGElementReference<TInputData>> result = new ArrayList<>();
        // Add reference for direct children
        List<TDMNElementReference> references = requiredInputDataReferences(parent);
        for (TDMNElementReference reference : references) {
            TInputData child = findInputDataByRef(parent, reference.getHref());
            if (child != null) {
                String importName = findImportName(parent, reference);
                result.add(makeDRGElementReference(importName, child));
            } else {
                throw new DMNRuntimeException(String.format("Cannot find InputData for '%s' in parent '%s'", reference.getHref(), parent.getName()));
            }
        }
        return result;
    }
