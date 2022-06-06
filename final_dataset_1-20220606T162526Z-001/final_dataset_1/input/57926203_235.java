protected static List<RenderedServicePathHop> createRenderedServicePathHopList(List<SfName> serviceFunctionNameList,
            List<String> sfgNameList, int serviceIndex) {
        List<RenderedServicePathHop> renderedServicePathHopArrayList = new ArrayList<>();
        RenderedServicePathHopBuilder renderedServicePathHopBuilder = new RenderedServicePathHopBuilder();

        short posIndex = 0;

        if (serviceFunctionNameList == null && sfgNameList == null) {
            LOG.error("Could not create the hop list caused by empty name list");
            return null;
        }

        if (sfgNameList != null) {
            for (String sfgName : sfgNameList) {
                ServiceFunctionGroup sfg = SfcProviderServiceFunctionGroupAPI.readServiceFunctionGroup(sfgName);
                if (sfg == null) {
                    LOG.error("Could not find suitable SFG in data store by name: {}", sfgName);
                    renderedServicePathHopArrayList.clear();
                    break;
                }
                // TODO Bug 4495 - RPCs hiding heuristics using Strings - alagalah
                /*
                 * Note I didn't change SFG's typing since I still am unclear as to
                 * what problem SFG is trying to solve, hence any String-String heuristics
                 * would be opaque for me to resolve in refactoring.
                 */
                ServiceFunction serviceFunction = SfcProviderServiceFunctionAPI
                    .readServiceFunction(new SfName(sfg.getSfcServiceFunction().get(0).getName()));
                if (serviceFunction == null) {
                    LOG.error("Could not find suitable SF in data store by name: {}",
                            sfg.getSfcServiceFunction().get(0).getName());
                    renderedServicePathHopArrayList.clear();
                    break;
                }
                createSFGHopBuilder(serviceIndex, renderedServicePathHopBuilder, posIndex, sfg.getName(),
                        serviceFunction);
                renderedServicePathHopArrayList.add(posIndex, renderedServicePathHopBuilder.build());
                serviceIndex--;
                posIndex++;
            }

        } else {
            for (SfName serviceFunctionName : serviceFunctionNameList) {
                ServiceFunction serviceFunction =
                        SfcProviderServiceFunctionAPI.readServiceFunction(serviceFunctionName);
                if (serviceFunction == null) {
                    LOG.error("Could not find suitable SF in data store by name: {}", serviceFunctionName);
                    return null;
                }
                createSFHopBuilder(serviceIndex, renderedServicePathHopBuilder, posIndex, serviceFunctionName,
                        serviceFunction);
                renderedServicePathHopArrayList.add(posIndex, renderedServicePathHopBuilder.build());
                serviceIndex--;
                posIndex++;
            }
        }

        return renderedServicePathHopArrayList;
    }
