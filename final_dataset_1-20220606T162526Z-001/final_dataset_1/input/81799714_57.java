@Override
    public void renderFormatItemRowOpen(Appendable writer, Map<String, Object> context, ModelForm modelForm) throws IOException {
        Integer itemIndex = (Integer) context.get("itemIndex");
        String altRowStyles = "";
        String evenRowStyle = "";
        String oddRowStyle = "";
        if (itemIndex != null) {
            altRowStyles = modelForm.getStyleAltRowStyle(context);
            if (itemIndex % 2 == 0) {
                evenRowStyle = modelForm.getEvenRowStyle();
            } else {
                oddRowStyle = FlexibleStringExpander.expandString(modelForm.getOddRowStyle(), context);
            }
        }
        StringWriter sr = new StringWriter();
        sr.append("<@renderFormatItemRowOpen ");
        sr.append(" formName=\"");
        sr.append(modelForm.getName());
        sr.append("\" itemIndex=");
        sr.append(String.valueOf(itemIndex));
        sr.append(" altRowStyles=\"");
        sr.append(altRowStyles);
        sr.append("\" evenRowStyle=\"");
        sr.append(evenRowStyle);
        sr.append("\" oddRowStyle=\"");
        sr.append(oddRowStyle);
        sr.append("\" />");
        executeMacro(writer, sr.toString());
    }
