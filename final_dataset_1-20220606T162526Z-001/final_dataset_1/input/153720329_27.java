static <Q extends QueryResultSet<?>> Query<Q> buildQuery(Query<Q> tmpQuery, List<PostQueryInfo> postQueryInfoList) {
        Query<Q> result = tmpQuery;
        for (PostQueryInfo postQueryInfo : postQueryInfoList) {
            PostQueryType type = postQueryInfo.getType();
            switch (type) {
                case CAL_FIELD:
                    result = (Query<Q>) new FieldCalQuery((Query<QueryResultSet<SwiftNode>>) result, ((CalculatedFieldQueryInfo) postQueryInfo).getCalInfo());
                    break;
                case HAVING_FILTER:
                    result = (Query<Q>) new HavingFilterQuery((Query<QueryResultSet<SwiftNode>>) result, ((HavingFilterQueryInfo) postQueryInfo).getMatchFilterList());
                    break;
                case TREE_FILTER:
                    result = (Query<Q>) new TreeFilterQuery((Query<QueryResultSet<SwiftNode>>) result, ((TreeFilterQueryInfo) postQueryInfo).getMatchFilterList());
                    break;
                case TREE_AGGREGATION:
                    result = (Query<Q>) new TreeAggregationQuery((Query<QueryResultSet<GroupPage>>) result, ((TreeAggregationQueryInfo) postQueryInfo).getAggregators());
                    break;
                case TREE_SORT:
                    result = (Query<Q>) new TreeSortQuery((Query<QueryResultSet<SwiftNode>>) result, ((TreeSortQueryInfo) postQueryInfo).getSortList());
                    break;
                case ROW_SORT:
                    result = (Query<Q>) new RowSortQuery((Query<QueryResultSet<SwiftNode>>) result, ((RowSortQueryInfo) postQueryInfo).getSortList());
                    break;
                case FUNNEL_TIME_MEDIAN:
                    result = (Query<Q>) new FunnelTimeMedianPostQuery((Query<QueryResultSet<SwiftNode>>) result, ((FunnelPostQueryInfo) postQueryInfo).getTimeWindowBean());
                    break;
                case FUNNEL_CONVERSION_RATE:
                    result = (Query<Q>) new FunnelConversionRatePostQuery((Query<QueryResultSet<SwiftNode>>) result);
                    break;
                case FUNNEL_TIME_AVG:
                    result = (Query<Q>) new FunnelTimeAvgPostQuery((Query<QueryResultSet<SwiftNode>>) result);
                    break;
                default:
            }
        }
        return result;
    }
