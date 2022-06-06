@Override
	public Set<Subcase<String>> getSubcases() {
		// TODO: this is wasteful with regards to the case of string length of zero, which always results in ""
		return Subcases.pairwisePermutations(
			length.getSubcases(),
			sourceStrings.getSubcases(),

			(rnd, length, strings) -> {
				if(length == null || length <= 0)
					return "";
				else if(length > 1024)
					length = 1024;

				if(strings == null || strings.isEmpty())
					strings = Collections.singleton("X");

				String[] stringsArr = strings.toArray(new String[strings.size()]);

				StringBuilder sb = new StringBuilder(length);
				while(sb.length() < length) {
					String chr = stringsArr[rnd.nextInt(stringsArr.length)];
					if(chr.length() == 0)
						chr = "X";

					sb.append(chr);
					if(sb.length() > length) {
						sb.delete(length, sb.length());
					}
				}

				return sb.toString();
			}
		);
	}
