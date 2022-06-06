public SatGraph(Formula formula, FormulaEvaluator formulaEvaluator) throws Exception
    {
        super();
        _formula = formula;
        _formulaEvaluator = formulaEvaluator;
        // /~ 1 ~ 2 ~ 3 ~ ... n
        // 0
        // \~ -1 ~ -2 ~ -3 ~ ... -n
        _nodes.put(new Integer(0), new Node(0));

        for (int i = 1; i <= formula.getLiteralCount(); i++)
        {
            _nodes.put(new Integer(i), new Node(i));
            _nodes.put(new Integer(-i), new Node(-i));
        }
    }
