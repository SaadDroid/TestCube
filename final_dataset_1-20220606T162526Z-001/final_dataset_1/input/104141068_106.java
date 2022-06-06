private MinijaxCriteriaQuery<T> parseSelect() {
        consume(TokenType.KEYWORD_SELECT);

        query = cb.createQuery(resultType);

        // TODO: Parse selection instead of skipping
        while (getCurr().getTokenType() != TokenType.KEYWORD_FROM) {
            index++;
        }

        // TODO: Parse FROM and JOIN instead of skipping
        consume(TokenType.KEYWORD_FROM);

        // TODO: How to get entityType from string name?
        // May need to add extra methods to MinijaxMetamodel
        final MinijaxEntityType<T> resultEntityType = cb.getMetamodel().entity(resultType);
        final String entityTypeName = consume(TokenType.SYMBOL).getValue();
        if (!resultEntityType.getName().equals(entityTypeName)) {
            throw new PersistenceException(
                    "Result type does not match entity type name (resultEntityType=" +
                    resultEntityType.getName() +
                    ", entityTypeName=" +
                    entityTypeName + ")");
        }
        root = query.from(resultType);

        final String entityTypeAlias = consume(TokenType.SYMBOL).getValue();
        root.alias(entityTypeAlias);

        while (!eof()) {
            final Token curr = getCurr();
            switch (curr.getTokenType()) {
            case KEYWORD_WHERE:
                parseWhere();
                break;

            case KEYWORD_ORDER:
                parseOrderBy();
                break;

            default:
                throw new PersistenceException("Unexpected token: " + curr);
            }
        }

        return query;
    }
