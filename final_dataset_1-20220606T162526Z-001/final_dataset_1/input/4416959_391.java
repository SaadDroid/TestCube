public static List<OptionModel> toOptionModels(String input)
    {
        assert input != null;
        List<OptionModel> result = CollectionFactory.newList();

        for (String term : input.split(","))
            result.add(toOptionModel(term.trim()));

        return result;
    }
