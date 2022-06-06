public static int compareTemplates(URITemplate t1, URITemplate t2) {
        int l1 = t1.getLiteralChars().length();
        int l2 = t2.getLiteralChars().length();
        // descending order
        int result = l1 < l2 ? 1 : l1 > l2 ? -1 : 0;
        if (result == 0) {
            int g1 = t1.getVariables().size();
            int g2 = t2.getVariables().size();
            // descending order
            result = g1 < g2 ? 1 : g1 > g2 ? -1 : 0;
            if (result == 0) {
                int gCustom1 = t1.getCustomVariables().size();
                int gCustom2 = t2.getCustomVariables().size();
                result = gCustom1 < gCustom2 ? 1 : gCustom1 > gCustom2 ? -1 : 0;
                if (result == 0) {
                    result = t1.getPatternValue().compareTo(t2.getPatternValue());
                }
            }
        }

        return result;
    }
