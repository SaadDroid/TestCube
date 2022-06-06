public static void main(String[] args) {
        String tokenString = "4 3 2 - 1 + *";
        Stack<Expression> stack = new Stack<>();

        String[] tokenList = tokenString.split(" ");
        for (String s : tokenList) {
            if (isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                LOGGER.info("popped from stack left: {} right: {}",
                        leftExpression.interpret(), rightExpression.interpret());
                Expression operator = getOperatorInstance(s, leftExpression, rightExpression);
                LOGGER.info("operator: {}", operator);
                int result = operator.interpret();
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
                LOGGER.info("push result to stack: {}", resultExpression.interpret());
            } else {
                Expression i = new NumberExpression(s);
                stack.push(i);
                LOGGER.info("push to stack: {}", i.interpret());
            }
        }
        LOGGER.info("result: {}", stack.pop().interpret());
    }
