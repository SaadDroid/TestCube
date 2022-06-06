@Override
    public String render(String template, StatementContext ctx) {
        return RENDER_CACHE.get(template, ctx).apply(ctx);
    }
