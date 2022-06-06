public static List<RatedDate<ExtractedDate>> getDates(Document document, PageDateType type) {
        Validate.notNull(document, "document must not be null");
        Validate.notNull(type, "type must not be null");
        
        ContentDateGetter contentDateGetter = new ContentDateGetter();
        List<ContentDate> dates = contentDateGetter.getDates(document);

        List<RatedDate<ExtractedDate>> ratedDates = rate(dates, type);
        Collections.sort(ratedDates, RatedDateComparator.INSTANCE);

        return ratedDates;
    }
