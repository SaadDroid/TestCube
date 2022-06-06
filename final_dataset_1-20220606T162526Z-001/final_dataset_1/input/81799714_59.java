@Override
    public void renderFormatItemRowFormCellOpen(Appendable writer, Map<String, Object> context, ModelForm modelForm) throws IOException {
        String areaStyle = modelForm.getFormTitleAreaStyle();
        StringWriter sr = new StringWriter();
        sr.append("<@renderFormatItemRowFormCellOpen ");
        sr.append(" style=\"");
        sr.append(areaStyle);
        sr.append("\" />");
        executeMacro(writer, sr.toString());
    }
