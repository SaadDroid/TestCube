@Override
  public Interpreter getInterpreter(String replName,
                                    ExecutionContext executionContext)
      throws InterpreterNotFoundException {

    if (StringUtils.isBlank(replName)) {
      // Get the default interpreter of the defaultInterpreterSetting
      InterpreterSetting defaultSetting =
          interpreterSettingManager.getByName(executionContext.getDefaultInterpreterGroup());
      return defaultSetting.getDefaultInterpreter(executionContext);
    }

    String[] replNameSplits = replName.split("\\.");
    if (replNameSplits.length == 2) {
      String group = replNameSplits[0];
      String name = replNameSplits[1];
      InterpreterSetting setting = interpreterSettingManager.getByName(group);
      if (null != setting) {
        Interpreter interpreter = setting.getInterpreter(executionContext, name);
        if (null != interpreter) {
          return interpreter;
        }
        throw new InterpreterNotFoundException("No such interpreter: " + replName);
      }
      throw new InterpreterNotFoundException("No interpreter setting named: " + group);

    } else if (replNameSplits.length == 1){
      // first assume group is omitted
      InterpreterSetting setting =
          interpreterSettingManager.getByName(executionContext.getDefaultInterpreterGroup());
      if (setting != null) {
        Interpreter interpreter = setting.getInterpreter(executionContext, replName);
        if (null != interpreter) {
          return interpreter;
        }
      }

      // then assume interpreter name is omitted
      setting = interpreterSettingManager.getByName(replName);
      if (null != setting) {
        return setting.getDefaultInterpreter(executionContext);
      }
    }

    throw new InterpreterNotFoundException("No such interpreter: " + replName);
  }
