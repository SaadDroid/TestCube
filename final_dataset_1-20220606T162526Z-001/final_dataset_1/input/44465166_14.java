public static List<int[]> getAllBinaryCombinations(int numElements) {
        List<int[]> output = new ArrayList<>();

        output.add(new int[] {0});
        output.add(new int[] {1});

        for (int elementId = 1; elementId < numElements; elementId++) {

            List<int[]> newOutput = new ArrayList<>();

            for (int[] instance : output) {

                // make a new copy of instance
                int[] newInstance0 = new int[instance.length + 1];
                int[] newInstance1 = new int[instance.length + 1];
                for (int i = 0; i < instance.length; i++) {

                    newInstance0[i] = instance[i];
                    newInstance1[i] = instance[i];
                }

                // add 0, add to new output
                newInstance0[elementId] = 0;
                newOutput.add(newInstance0);

                // add 1, add to new output
                newInstance1[elementId] = 1;
                newOutput.add(newInstance1);

            }

            // replace output to new output
            output = newOutput;
        }

        return output;
    }
