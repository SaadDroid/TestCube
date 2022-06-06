@Override
    public String toString() {
        if (document.getFxomRoot() == null) {
            return I18N.getString("skeleton.empty");
        } else {
            construct();

            StringBuilder code = new StringBuilder();
            code.append(header);
            code.append(packageLine);

            for (String importStatement : imports) {
                code.append(importStatement);
            }

            code.append(classLine);

            if (textType == TEXT_TYPE.WITH_COMMENTS && textFormat == FORMAT_TYPE.FULL) {
                code.append(INDENT).append("@FXML // ResourceBundle that was given to the FXMLLoader\n") //NOI18N
                        .append(INDENT).append("private ResourceBundle resources;\n\n") //NOI18N
                        .append(INDENT).append("@FXML // URL location of the FXML file that was given to the FXMLLoader\n") //NOI18N
                        .append(INDENT).append("private URL location;\n\n"); //NOI18N
            } else if (textFormat == FORMAT_TYPE.FULL) {
                code.append(INDENT).append(FXML_ANNOTATION) //NOI18N
                        .append(INDENT).append("private ResourceBundle resources;\n\n") //NOI18N
                        .append(INDENT).append(FXML_ANNOTATION) //NOI18N
                        .append(INDENT).append("private URL location;\n\n"); //NOI18N
            }

            code.append(variables);
            code.append(handlers);
            code.append(initialize);
            code.append("}\n"); //NOI18N

            return code.toString();
        }
    }
