@Override
  public JsonObject invoke(Ledger ledger, JsonObject argument, Optional<JsonObject> property) {
    if (!argument.containsKey("asset_id")) {
      throw new ContractContextException("asset_id attribute is missing");
    }

    AssetFilter filter = new AssetFilter(argument.getString("asset_id"));

    if (argument.containsKey("start")) {
      int start = argument.getInt("start");
      checkNonNegative(start);
      filter.withStartVersion(start, true);
    }

    if (argument.containsKey("end")) {
      int end = argument.getInt("end");
      checkNonNegative(end);
      filter.withEndVersion(end, false);
    }

    if (argument.containsKey("limit")) {
      int limit = argument.getInt("limit");
      checkNonNegative(limit);
      filter.withLimit(limit);
    }

    if (argument.containsKey("asc_order")) {
      boolean ascendingOrder = argument.getBoolean("asc_order");
      if (ascendingOrder) {
        filter.withVersionOrder(VersionOrder.ASC);
      } else {
        filter.withVersionOrder(VersionOrder.DESC);
      }
    }

    JsonArrayBuilder assets = Json.createArrayBuilder();
    ledger
        .scan(filter)
        .forEach(
            asset -> {
              JsonObject json =
                  Json.createObjectBuilder()
                      .add("asset_id", asset.id())
                      .add("age", asset.age())
                      .add("data", asset.data())
                      .build();
              assets.add(json);
            });

    return Json.createObjectBuilder().add("data", assets.build()).build();
  }
