private PlantUmlDiagram createDiagram(List<String> rawDiagramLines) {
        List<String> diagramLines = filterOutComments(rawDiagramLines);
        Set<PlantUmlComponent> components = parseComponents(diagramLines);
        PlantUmlComponents plantUmlComponents = new PlantUmlComponents(components);

        List<ParsedDependency> dependencies = parseDependencies(plantUmlComponents, diagramLines);

        return new PlantUmlDiagram.Builder(plantUmlComponents)
                .withDependencies(dependencies)
                .build();
    }
