@JsonProperty("value")
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.WRAPPER_OBJECT)
    public Object getControlValue() {
        return controlValue;
    }
