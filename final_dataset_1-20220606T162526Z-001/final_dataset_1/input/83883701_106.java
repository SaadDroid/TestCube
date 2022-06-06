public String getSelectedMenuPath(MenuItem menuItem) {
        LinkedList<String> pathText = new LinkedList<>();
        while (menuItem != null) {
            String textForMenu = getTextForMenuItem(menuItem);
            pathText.addFirst(escapeSpecialCharacters(textForMenu));
            menuItem = menuItem.getParentMenu();
        }
        return buildSelectedMenuPath(pathText);
    }
