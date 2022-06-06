public <T extends Resource> JSONApiObject<T> fromJson(String jsonObject) {
        JSONApiObject jsonApiObject = new JSONApiObject();
        try {
            JSONObject json = new JSONObject(jsonObject);
            HashMap<String, Resource> includes = new HashMap<>();

            if (json.isNull("errors")) {
                if (!json.isNull("included")) {
                    JSONArray included = json.getJSONArray("included");
                    for (int i = 0; i < included.length(); i++) {
                        JSONObject each = included.getJSONObject(i);
                        String key = getResourceTag(each);

                        includes.put(key, resourceFromJson(each, includes));
                    }

                    //Second pass to check if there is this item on relationships
                    for (int i = 0; i < included.length(); i++) {
                        JSONObject each = included.getJSONObject(i);
                        String key = getResourceTag(each);

                        includes.remove(key);
                        includes.put(key, resourceFromJson(each, includes));
                    }
                }

                if (!json.isNull("data")) {
                    Object data = json.get("data");
                    if (data instanceof JSONObject) {
                        //Single Object
                        JSONObject objectData = (JSONObject) data;
                        jsonApiObject.addData(resourceFromJson(objectData, includes));
                    } else if (data instanceof JSONArray) {
                        //ListObjects
                        JSONArray objectData = (JSONArray) data;
                        for (int i = 0; i < objectData.length(); i++) {
                            jsonApiObject.addData(resourceFromJson(objectData.getJSONObject(i), includes));
                        }
                    }
                }

                if (!json.isNull("links"))
                    jsonApiObject.setLinks(linksFromJson(json.getJSONObject("links")));

                if (!json.isNull("meta"))
                    jsonApiObject.setMeta(json.getJSONObject("meta"));

                Field hasErrors = jsonApiObject.getClass().getDeclaredField("hasErrors");
                boolean oldAcessible = hasErrors.isAccessible();
                hasErrors.setAccessible(true);
                hasErrors.setBoolean(jsonApiObject, false);
                hasErrors.setAccessible(oldAcessible);
            } else {
                JSONArray errorList = json.getJSONArray("errors");
                List<ErrorModel> errorModelList = new ArrayList<>();
                for (int i = 0; i < errorList.length(); i++) {
                    ErrorModel error = new ErrorModel();
                    JSONObject eachRow = errorList.getJSONObject(i);

                    if (!eachRow.isNull("code"))
                        error.setStatus(eachRow.getString("code"));

                    if (!eachRow.isNull("detail"))
                        error.setDetail(eachRow.getString("detail"));

                    if (!eachRow.isNull("title"))
                        error.setTitle(eachRow.getString("title"));

                    if (!eachRow.isNull("source")) {
                        ErrorSource source = new ErrorSource();
                        JSONObject sourceJson = eachRow.getJSONObject("source");

                        if (!sourceJson.isNull("parameter"))
                            source.setParameter(sourceJson.getString("parameter"));

                        if (!sourceJson.isNull("pointer"))
                            source.setPointer(sourceJson.getString("pointer"));

                        error.setSource(source);
                    }

                    errorModelList.add(error);
                }

                Field hasErrors = jsonApiObject.getClass().getDeclaredField("errors");
                boolean oldAcessible = hasErrors.isAccessible();
                hasErrors.setAccessible(true);
                hasErrors.set(jsonApiObject, errorModelList);
                hasErrors.setAccessible(oldAcessible);
            }
        } catch (Exception ex) {
            Log.e(JSONApiConverter.class.getSimpleName(), "Here _ " + ex.getMessage());
            ex.printStackTrace();
        }
        return jsonApiObject;
    }
