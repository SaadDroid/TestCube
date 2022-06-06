String templateParent(PreparedDocument rdoc, ObjectPidsPath path) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException, JAXBException {
        ResourceBundle resourceBundle = resourceBundleService.getResourceBundle("base", localesProvider.get());

        StringTemplate template = new StringTemplate(IOUtils.readAsString(this.getClass().getResourceAsStream("templates/_first_page.st"), Charset.forName("UTF-8"), true));
        FirstPageViewObject fpvo = prepareViewObject(resourceBundle);

        // tistena polozka
        GeneratedItem itm = new GeneratedItem();
        
        // detaily
        Map<String, LinkedHashSet<String>> detailItemValues = new HashMap<String, LinkedHashSet<String>>();
        Map<String, Map<String, List<String>>> mods = processModsFromPath(path, null);

        // Hlavni nazev
        String rootPid = path.getRoot();
        if (mods.get(rootPid).containsKey(TitleBuilder.MODS_TITLE)) {
            List<String> list = mods.get(rootPid).get(TitleBuilder.MODS_TITLE);
            if (!list.isEmpty()) {
                String key = TitleBuilder.MODS_TITLE;
                itemVals(detailItemValues, list, key);
            }
        }

        // pouze jeden root
        String[] rProps = renderedProperties(true);
        String[] fromRootToLeaf = path.getPathFromRootToLeaf();
        for (int i = 0; i < fromRootToLeaf.length; i++) {
            String pidPath = fromRootToLeaf[i];
            for (String prop : rProps) {
                if (mods.get(pidPath).containsKey(prop)) {
                    List<String> list = mods.get(pidPath).get(prop);
                    itemVals(detailItemValues, list, prop);
                }
            }
        }

        // hlavni nazev
        List<DetailItem> details = new ArrayList<FirstPagePDFServiceImpl.DetailItem>();
        LinkedHashSet<String> maintitles = detailItemValues.get(TitleBuilder.MODS_TITLE);
        String key =  maintitles != null && maintitles.size() > 1 ? resourceBundle.getString("pdf.fp.titles") :  resourceBundle.getString("pdf.fp.title");
        if (maintitles != null && (!maintitles.isEmpty())) {
            details.add(new DetailItem(key, vals(maintitles).toString()));
        }

        String[] props = renderedProperties(true);
        for(String prop: props) {
            LinkedHashSet<String> vals = detailItemValues.get(prop);
            key = vals != null && vals.size() > 1 ? resourceBundle.getString(i18nKey(prop)+"s") :  resourceBundle.getString(i18nKey(prop));
            if (vals != null && (!vals.isEmpty())) {
                details.add(new DetailItem(key, vals(vals).toString()));
            }
        }

        
        pagesInParentPdf(rdoc, resourceBundle, details);

        itm.setDetailItems((DetailItem[]) details.toArray(new DetailItem[details.size()]));
        

        fpvo.setGeneratedItems( new GeneratedItem[] { itm });
        template.setAttribute("viewinfo", fpvo);
        String templateText = template.toString();
        return templateText;
    }
