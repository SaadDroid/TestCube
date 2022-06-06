public UniverseQuery convertQuery(String text, UniverseClient client, String token)
      throws UniverseException {
    StringBuilder select = new StringBuilder();
    StringBuilder universe = new StringBuilder();
    StringBuilder buf = new StringBuilder();
    StringBuilder resultObj = new StringBuilder();
    StringBuilder whereBuf = new StringBuilder();
    UniverseInfo universeInfo = null;
    String where = null;
    boolean singleQuoteClosed = true;
    boolean pathClosed = true;
    boolean universePart = false;
    boolean selectPart = false;
    boolean wherePart = false;
    boolean listOperator = false;
    boolean operatorPosition = false;
    boolean duplicatedRows = true;
    Map<String, UniverseNodeInfo> nodeInfos = null;
    OptionalInt limit = OptionalInt.empty();

    final int limitIndex = text.lastIndexOf("limit");
    if (limitIndex != -1) {
      final String[] arguments = delimiter.delimit(text, 0).getArguments();
      final int length = arguments.length;
      if (arguments[length - 3].equals("limit")) {
        limit = parseInt(arguments[length - 2]);
      } else if (arguments[length - 2].equals("limit")) {
        final String toParse = arguments[length - 1];
        limit = parseInt(toParse.endsWith(";") ?
            toParse.substring(0, toParse.length() - 1) : toParse);
      }
      text = text.substring(0, limitIndex);
    }

    if (!text.endsWith(";")) {
      text += ";";
    }

    char[] array = text.toCharArray();
    for (int i = 0; i < array.length; i++) {
      char c = array[i];
      buf.append(c);
      if (c == '\'') {
        if (i == 0 || array[i - 1] != '\\') {
          singleQuoteClosed = !singleQuoteClosed;
        }
      }
      if (c == '[' && pathClosed && singleQuoteClosed) {
        pathClosed = false;
        if (wherePart) {
          operatorPosition = false;
        }
      }
      if (c == ']' && !pathClosed && singleQuoteClosed) {
        pathClosed = true;
        if (wherePart) {
          operatorPosition = true;
          if (i + 1 == array.length || (array[i + 1] != '.'
              && isFilter(String.format("%s]", whereBuf.toString()), text.substring(i + 1)))) {
            whereBuf.append(c);
            whereBuf.append(MARKER_FILTER);
            if (i + 1 == array.length) {
              wherePart = false;
              where = parseWhere(whereBuf.toString(), nodeInfos);
            }
            continue;
          }
        }
      }
      if (c == '(' && wherePart && pathClosed && singleQuoteClosed) {
        if (listOperator) {
          whereBuf.append(MARKER_LEFT_BRACE);
          continue;
        } else {
          whereBuf.append(c);
          continue;
        }
      }
      if (c == ')' && wherePart && pathClosed && singleQuoteClosed) {
        if (listOperator) {
          whereBuf.append(MARKER_RIGHT_BRACE);
          listOperator = false;
          continue;
        } else {
          whereBuf.append(c);
          continue;
        }
      }

      if (!universePart && singleQuoteClosed
          && buf.toString().toLowerCase().endsWith("universe")) {
        universePart = true;
        continue;
      }

      if (universePart) {
        if (c == ';' && singleQuoteClosed) {
          universePart = false;
          if (universe.toString().trim().length() > 2) {
            String universeName =
                universe.toString().trim().substring(1, universe.toString().trim().length() - 1);
            universeInfo = client.getUniverseInfo(universeName);
            nodeInfos = client.getUniverseNodesInfo(token, universeName);
          }
        } else {
          universe.append(c);
        }
        continue;
      }

      if (!selectPart && pathClosed && singleQuoteClosed
          && buf.toString().toLowerCase().endsWith("select")) {
        if (StringUtils.isBlank(universe.toString())) {
          throw new UniverseException("Not found universe name");
        }
        selectPart = true;
        select.append(RESULT_START_TEMPLATE);
        continue;
      }

      if (!wherePart && pathClosed && singleQuoteClosed) {
        if (buf.toString().toLowerCase().endsWith("where")) {
          wherePart = true;
        }
        if (buf.toString().toLowerCase().endsWith("where") || i == array.length - 1) {
          selectPart = false;
          select.append(parseResultObj(resultObj.toString()
                  .replaceAll("(?i)wher$", "").replaceAll("(?i)distinc", ""),
              nodeInfos));
          select.append(RESULT_END_TEMPLATE);
          continue;
        }
      }

      if (selectPart) {
        if (pathClosed && singleQuoteClosed && buf.toString().toLowerCase().endsWith("distinct")) {
          duplicatedRows = false;
          continue;
        }
        if (pathClosed && singleQuoteClosed && c == ',') {
          select.append(parseResultObj(resultObj.toString().replaceAll("(?i)distinc", ""), nodeInfos));
          resultObj = new StringBuilder();
        } else {
          resultObj.append(c);
        }
        continue;
      }

      if (wherePart) {
        if (c == ';' && pathClosed && singleQuoteClosed) { // todo: check for limit
          wherePart = false;
          where = parseWhere(whereBuf.toString(), nodeInfos);
        } else {
          if (!singleQuoteClosed || !pathClosed) {
            switch (c) {
              case ' ':
              case '\n':
                whereBuf.append(MARKER_BACKSPACE);
                break;
              case '(':
                whereBuf.append(MARKER_LEFT_BRACE);
                break;
              case ')':
                whereBuf.append(MARKER_RIGHT_BRACE);
                break;
              default:
                whereBuf.append(c);
            }
          } else if (pathClosed) {
            if ((c == 'a' || c == 'A') && i < array.length - 2 &&
                text.substring(i, i + 3).equalsIgnoreCase("and")) {
              i += 2;
              whereBuf.append(MARKER_AND);
              operatorPosition = false;
              continue;
            }
            if ((c == 'o' || c == 'O') && i < array.length - 1 &&
                text.substring(i, i + 2).equalsIgnoreCase("or")) {
              i += 1;
              whereBuf.append(MARKER_OR);
              operatorPosition = false;
              continue;
            }
            if (operatorPosition) {
              switch (c) {
                case '=':
                  whereBuf.append(MARKER_EQUAL);
                  operatorPosition = false;
                  break;
                case '<':
                  if (i + 1 < array.length) {
                    if (array[i + 1] == '=') {
                      whereBuf.append(MARKER_LESS_EQUAL);
                      operatorPosition = false;
                      i++;
                      break;
                    } else if (array[i + 1] == '>') {
                      whereBuf.append(MARKER_NOT_EQUAL);
                      operatorPosition = false;
                      i++;
                      break;
                    }
                  }
                  operatorPosition = false;
                  whereBuf.append(MARKER_LESS);
                  break;
                case '>':
                  if (i + 1 < array.length) {
                    if (array[i + 1] == '=') {
                      whereBuf.append(MARKER_GREATER_EQUALS);
                      operatorPosition = false;
                      i++;
                      break;
                    }
                  }
                  operatorPosition = false;
                  whereBuf.append(MARKER_GREATER);
                  break;
                case 'i':
                case 'I':
                  boolean whileI = true;
                  StringBuilder operI = new StringBuilder();
                  operI.append(c);
                  while (whileI) {
                    i++;
                    if (i >= array.length) {
                      whileI = false;
                    }

                    if (array[i] != ' ' && array[i] != '\n') {
                      operI.append(array[i]);
                    } else {
                      continue;
                    }
                    String tmp = operI.toString().toLowerCase();
                    if (tmp.equals("in")) {
                      whereBuf.append(MARKER_IN);
                      listOperator = true;
                      whileI = false;
                      operatorPosition = false;
                    } else if (tmp.equals("isnull")) {
                      whereBuf.append(MARKER_NULL);
                      whileI = false;
                      operatorPosition = false;
                    } else if (tmp.equals("isnotnull")) {
                      whereBuf.append(MARKER_NOT_NULL);
                      whileI = false;
                      operatorPosition = false;
                    }
                    // longest 9 - isnotnull
                    if (tmp.length() > 8) {
                      whileI = false;
                    }
                  }
                  break;
                case 'n':
                case 'N':
                  boolean whileN = true;
                  StringBuilder operN = new StringBuilder();
                  operN.append(c);
                  while (whileN) {
                    i++;
                    if (i >= array.length) {
                      whileN = false;
                    }

                    if (array[i] != ' ' && array[i] != '\n') {
                      operN.append(array[i]);
                    } else {
                      continue;
                    }

                    String tmp = operN.toString().toLowerCase();

                    if (tmp.equals("notin")) {
                      whereBuf.append(MARKER_NOT_IN);
                      listOperator = true;
                      whileN = false;
                      operatorPosition = false;
                    }

                    // longest 5 - notin
                    if (tmp.length() > 4) {
                      whileN = false;
                    }
                  }
                  break;
                default:
                  whereBuf.append(c);
              }
            } else {
              whereBuf.append(c);
            }
          } else {
            whereBuf.append(c);
          }
        }
      }
    }

    if (wherePart && StringUtils.isBlank(where)) {
      throw new UniverseException("Incorrect block where");
    }

    UniverseQuery universeQuery = new UniverseQuery(select.toString().trim(),
        where, universeInfo, duplicatedRows, limit);

    if (!universeQuery.isCorrect()) {
      throw new UniverseException("Incorrect query");
    }

    return universeQuery;
  }
