public static RangeHeader parseRangeHeader(String rangeHeaderVal, long
      length) {
    long start = 0;
    long end = 0;
    boolean noStart = false;
    boolean readFull = false;
    boolean inValidRange = false;
    RangeHeader rangeHeader;
    Matcher matcher = RANGE_HEADER_MATCH_PATTERN.matcher(rangeHeaderVal);
    if (matcher.matches()) {
      if (!matcher.group("start").equals("")) {
        start = Long.parseLong(matcher.group("start"));
      } else {
        noStart = true;
      }
      if (!matcher.group("end").equals("")) {
        end = Long.parseLong(matcher.group("end"));
      } else {
        end = length - 1;
      }
      if (noStart) {
        if (end < length) {
          start = length - end;
        } else {
          start = 0;
        }
        end = length - 1;
      } else {
        if (start >= length)  {
          readFull = true;
          if (end >= length) {
            inValidRange = true;
          } else {
            start = 0;
            end = length - 1;
          }
        } else {
          if (end >= length) {
            end = length - 1;
          }
        }
      }
    } else {
      // Byte specification is not matching or start and endoffset provided
      // are not matching with regex.
      start = 0;
      end = length - 1;
      readFull = true;
    }
    rangeHeader = new RangeHeader(start, end, readFull, inValidRange);
    return rangeHeader;

  }
