public static List<ws.palladian.extraction.multimedia.Color> detectColors(BufferedImage bufferedImage) {
        final double maxClusterDistance = 50;

        final int upperBound = 245;
        final int lowerBound = 10;

        List<ColorCluster> clusters = new ArrayList<>();

        for (int i = 0; i < bufferedImage.getWidth(); i++) {
            ol: for (int j = 0; j < bufferedImage.getHeight(); j++) {

                Color c1 = new Color(bufferedImage.getRGB(i, j));

                // discard too white and too dark
                if ((c1.getRed() > upperBound && c1.getGreen() > upperBound && c1.getBlue() > upperBound)
                        || (c1.getRed() < lowerBound && c1.getGreen() < lowerBound && c1.getBlue() < lowerBound)) {
                    continue;
                }

                // check whether we can add the color to an existing cluster or to open a new one
                for (ColorCluster cluster : clusters) {
                    double distance = colorDistance(cluster.getCenterColor(), c1);
                    if (distance < maxClusterDistance) {
                        cluster.totalRed += c1.getRed();
                        cluster.totalGreen += c1.getGreen();
                        cluster.totalBlue += c1.getBlue();
                        cluster.population++;
                        continue ol;
                    }
                }

                ColorCluster newCluster = new ColorCluster();
                newCluster.totalRed += c1.getRed();
                newCluster.totalGreen += c1.getGreen();
                newCluster.totalBlue += c1.getBlue();
                newCluster.population++;
                clusters.add(newCluster);
            }
        }

        Collections.sort(clusters, (o1, o2) -> o2.population - o1.population);

        List<ws.palladian.extraction.multimedia.Color> colors = new ArrayList<>();
        Set<String> seenMainColors = new HashSet<>();

        // go through clusters and get top 3 main colors
        for (ColorCluster cluster : clusters) {
            Color imageColor = cluster.getCenterColor();
            String hex = rgbToHex(imageColor);

            Double bestMatchScore = null;
            ws.palladian.extraction.multimedia.Color bestMatchColor = null;

            for (ws.palladian.extraction.multimedia.Color currentColor : COLORS) {
                Color color = hexToRgb(currentColor.getHexCode());
                double distance = colorDistance(imageColor, color);
                if (bestMatchColor == null || distance < bestMatchScore) {
                    bestMatchColor = new ws.palladian.extraction.multimedia.Color(hex, currentColor.getSpecificColorName(), currentColor.getMainColorName());
                    bestMatchScore = distance;
                }

            }

            if (seenMainColors.add(bestMatchColor.getMainColorName())) {
                colors.add(bestMatchColor);
            }

            if (seenMainColors.size() >= 3) {
                break;
            }
        }

        return colors;
    }
