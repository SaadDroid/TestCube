@Override
  public CNF asCNF() {
    Predicate expression = not.getArguments()[0];

    if (expression.getClass() == Comparison.class) {
      CNF cnf = new CNF();
      CNFElement cnfElement = new CNFElement();
      cnfElement.addPredicate(new ComparisonExpression(invertComparison((Comparison) expression)));
      cnf.addPredicate(cnfElement);
      return cnf;

    } else if (expression.getClass() == Not.class) {
      return QueryPredicate.createFrom(expression.getArguments()[0]).asCNF();

    } else if (expression.getClass() == And.class) {
      Predicate[] otherArguments = expression.getArguments();
      Or or = new Or(
        new Not(otherArguments[0]),
        new Not(otherArguments[0])
      );
      return QueryPredicate.createFrom(or).asCNF();

    } else if (expression.getClass() == Or.class) {
      Predicate[] otherArguments = expression.getArguments();
      And and = new And(
        new Not(otherArguments[0]),
        new Not(otherArguments[1])
      );

      return QueryPredicate.createFrom(and).asCNF();

    } else {
      Predicate[] otherArguments = expression.getArguments();
      Or or = new Or(
        new And(
          otherArguments[0],
          otherArguments[1]),
        new And(
          new Not(otherArguments[0]),
          new Not(otherArguments[0]))
      );

      return QueryPredicate.createFrom(or).asCNF();
    }
  }
