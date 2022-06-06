@Override
    public RegimenItem deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        RegimenItem regimenItem = gson.fromJson(json, RegimenItem.class);

        try {
            Regimen regimen = regimenRepository.getByCode(json.getAsJsonObject().get("code").getAsString());
            if (regimen == null) {
                regimen = createRegimen(json);
            }
            regimenItem.setRegimen(regimen);
        } catch (LMISException e) {
            new LMISException(e,"RegimenItemAdapter.deserialize").reportToFabric();
            throw new JsonParseException("can not find RegimenItem by name and category");
        }
        return regimenItem;
    }
