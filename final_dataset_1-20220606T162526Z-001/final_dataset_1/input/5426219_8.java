List<Integer> getAvailablePerplexities(String experimentAccession) {
        return tSnePlotDao.fetchPerplexities(experimentAccession);
    }
