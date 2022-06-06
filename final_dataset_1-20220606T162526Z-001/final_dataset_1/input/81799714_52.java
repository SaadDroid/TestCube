@Override
    public void renderFieldTitle(Appendable writer, Map<String, Object> context, ModelFormField modelFormField) throws IOException {
        String titleText = modelFormField.getTitle(context);
        String style = modelFormField.getTitleStyle();
        String id = modelFormField.getCurrentContainerId(context);
        StringBuilder sb = new StringBuilder();
        if (UtilValidate.isNotEmpty(titleText)) {
            if (" ".equals(titleText)) {
                executeMacro(writer, "<@renderFormatEmptySpace />");
            } else {
                titleText = UtilHttp.encodeAmpersands(titleText);
                titleText = encode(titleText, modelFormField, context);
                if (UtilValidate.isNotEmpty(modelFormField.getHeaderLink())) {
                    StringBuilder targetBuffer = new StringBuilder();
                    FlexibleStringExpander target = FlexibleStringExpander.getInstance(modelFormField.getHeaderLink());
                    String fullTarget = target.expandString(context);
                    targetBuffer.append(fullTarget);
                    String targetType = CommonWidgetModels.Link.DEFAULT_URL_MODE;
                    if (UtilValidate.isNotEmpty(targetBuffer.toString()) && targetBuffer.toString().toLowerCase(Locale
                            .getDefault()).startsWith("javascript:")) {
                        targetType = "plain";
                    }
                    StringWriter sr = new StringWriter();
                    makeHyperlinkString(sr, modelFormField.getHeaderLinkStyle(), targetType, targetBuffer.toString(), null, titleText, "",
                            modelFormField, this.request, this.response, context, "");
                    String title = sr.toString().replace("\"", "\'");
                    sr = new StringWriter();
                    sr.append("<@renderHyperlinkTitle ");
                    sr.append(" name=\"");
                    sr.append(modelFormField.getModelForm().getName());
                    sr.append("\" title=\"");
                    sr.append(encodeDoubleQuotes(title));
                    sr.append("\" />");
                    executeMacro(writer, sr.toString());
                } else if (modelFormField.isSortField()) {
                    renderSortField(writer, context, modelFormField, titleText);
                } else if (modelFormField.isRowSubmit()) {
                    StringWriter sr = new StringWriter();
                    sr.append("<@renderHyperlinkTitle ");
                    sr.append(" name=\"");
                    sr.append(modelFormField.getModelForm().getName());
                    sr.append("\" title=\"");
                    sr.append(titleText);
                    sr.append("\" showSelectAll=\"Y\"/>");
                    executeMacro(writer, sr.toString());
                } else {
                    sb.append(titleText);
                }
            }
        }
        if (!sb.toString().isEmpty()) {
            //check for required field style on single forms
            if ("single".equals(modelFormField.getModelForm().getType()) && modelFormField.getRequiredField()) {
                String requiredStyle = modelFormField.getRequiredFieldStyle();
                if (UtilValidate.isNotEmpty(requiredStyle)) {
                    style = requiredStyle;
                }
            }
            StringWriter sr = new StringWriter();
            sr.append("<@renderFieldTitle ");
            sr.append(" style=\"");
            sr.append(style);
            String displayHelpText = UtilProperties.getPropertyValue("widget", "widget.form.displayhelpText");
            if ("Y".equals(displayHelpText)) {
                Delegator delegator = WidgetWorker.getDelegator(context);
                Locale locale = (Locale) context.get("locale");
                String entityName = modelFormField.getEntityName();
                String fieldName = modelFormField.getFieldName();
                String helpText = UtilHelpText.getEntityFieldDescription(entityName, fieldName, delegator, locale);

                sr.append("\" fieldHelpText=\"");
                sr.append(encodeDoubleQuotes(helpText));
            }
            sr.append("\" title=\"");
            sr.append(sb.toString());
            if (UtilValidate.isNotEmpty(id)) {
                sr.append("\" id=\"");
                sr.append(id);
                sr.append("_title");
                // Render "for"
                sr.append("\" for=\"");
                sr.append(id);
            }
            sr.append("\" />");
            executeMacro(writer, sr.toString());
        }
    }
