@Override
    protected void renderContent(HttpServletRequest req, HttpServletResponse res) throws IOException {
        writeHeadNavigation(res);

        PrintWriter writer = res.getWriter();
        writeScriptIncludes(res);

        writer.write("<table id=\"plugin_table\" class=\"nicetable tablesorter noauto\">");
        writer.write("<thead><tr><th>Type</th><th>Model type</th><th>Model name</th><th>Source bundle</th></tr></thead>");
        writer.write("<tbody>");
        for (Entry<String, Collection<OsgiModelSource<?>>> entry : this.registry.getTypeMappings().entrySet()) {
            for (OsgiModelSource<?> source : entry.getValue()) {
                String sourceBundleName = displayNameOf(source.getBundle());

                writer.write("<tr data-modeltype=\"" + source.getModelType().getName() + "\">");
                String resourceType = buildLinkToResourceType(req, entry.getKey());
                writer.write("<td>" + resourceType + "</td>");
                writer.write("<td>" + source.getModelType().getName() + "</td>");
                writer.write("<td>" + source.getModelName() + "</td>");
                writer.write("<td><a href=\"bundles/" + source.getBundleId() + "\" " +
                        "title=\"" + sourceBundleName + "\">" + source.getBundleId() + "</a></td>");
                writer.write("</tr>");
            }
        }
        writer.write("</tbody>");
        writer.write("</table>");
    }
