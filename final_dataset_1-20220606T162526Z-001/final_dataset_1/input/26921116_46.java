@Override
    public String[] split(String text) {
        ArrayList<String> sentences = new ArrayList<>();

        // The number of words in the sentence.
        int len = 0;

        // Remove any carriage returns etc.
        text = REGEX_CARRIAGE_RETURN.matcher(text).replaceAll(" ");

        // We will use oct 031 (hex 19) as a special character for missing
        // space after punctuation. Oct 031 means "end of medium", which
        // probably never appears in a string in real applications.
        text = text.replace('\031', ' ');
        
        // make sure there are always spaces following punctuation to enable
        // splitter to work properly - covers such cases as "believe.I ...",
        // where a space has forgotten to be.
        text = REGEX_FORGOTTEN_SPACE.matcher(text).replaceAll("$1$2\031$3");

        text = text + "\n";

        // sentence ends with [.!?], followed by capital or number. Use base-line
        // splitter and then use some heuristics to improve upon this e.g.
        // dealing with Mr. and etc.  In this rather large regex we allow for
        // quotes, brackets etc.
        // $1 = the complete sentence including beginning punctuation and brackets
        // $2 = the punctuation mark - either [.!?:]
        // $3 = the brackets or quotes after the [!?.:]. This is non-grouping i.e. does not consume.
        // $4 = the next word after the [.?!:].This is non-grouping i.e. does not consume.
        // $5 = rather than a next word, it may have been the last sentence in the file. Therefore capture
        //      punctuation and brackets before end of file. This is non-grouping i.e. does not consume.
        Matcher matcher = REGEX_SENTENCE.matcher(text);
        StringBuilder currentSentence = new StringBuilder();
        int end = 0; // The offset of the end of sentence
        while (matcher.find()) {
            end = matcher.end();
            String sentence = matcher.group(1).trim();
            String punctuation = matcher.group(2);

            String stuffAfterPeriod = matcher.group(3);
            if (stuffAfterPeriod == null) {
                stuffAfterPeriod = matcher.group(5);
                if (stuffAfterPeriod == null) {
                    stuffAfterPeriod = "";
                } else {
                    end = matcher.end(5);
                }
            } else {
                end = matcher.end(3);
            }

            String[] words = REGEX_WHITESPACE.split(sentence);
            len += words.length;

            String nextWord = matcher.group(4);
            if (nextWord == null) {
                nextWord = "";
            }

            if (punctuation.compareTo(".") == 0) {
                // Consider the word before the period.
                // Is it an abbreviation? (then not full-stop)
                // Abbreviation if:
                //  1) all consonants and not all capitalised (and contain no lower case y e.g. shy, sly
                //  2) a span of single letters followed by periods
                //  3) a single letter (except I).
                //  4) in the known abbreviations list.
                // In above cases, then the period is NOT a full stop.

                // perhaps only one word e.g. P.S rather than a whole sentence
                Matcher lastWordMatcher = REGEX_LAST_WORD.matcher(sentence);
                String lastWord = "";
                if (lastWordMatcher.find()) {
                    lastWord = lastWordMatcher.group();
                }

                if ((!lastWord.matches(".*[AEIOUaeiou]+.*") && lastWord.matches(".*[a-z]+.*") && !lastWord.matches(".*[y]+.*"))
                        || lastWord.matches("([a-zA-Z][\\.])+")
                        || (lastWord.matches("^[A-Za-z]$") && !lastWord.matches("^[I]$"))
                        || EnglishAbbreviations.contains(lastWord.toLowerCase())) {

                    // We have an abbreviation, but this could come at the middle or end of a
                    // sentence. Therefore we assume that the abbreviation is not at the end of
                    // a sentence if the next word is a common word and the abbreviation occurs
                    // less than 5 words from the start of the sentence.
                    if (EnglishDictionary.CONCISE.contains(nextWord) && len > 6) {
                        // a sentence break
                        currentSentence.append(sentence);
                        currentSentence.append(punctuation);
                        currentSentence.append(stuffAfterPeriod.trim());
                        sentences.add(currentSentence.toString());
                        currentSentence = new StringBuilder();
                        len = 0;
                    } else {
                        // not a sentence break
                        currentSentence.append(sentence);
                        currentSentence.append(punctuation);
                        if (stuffAfterPeriod.indexOf('\031') == -1) {
                            currentSentence.append(' ');
                        }
                    }
                } else {
                    // a sentence break
                    currentSentence.append(sentence);
                    currentSentence.append(punctuation);
                    currentSentence.append(stuffAfterPeriod.trim());
                    sentences.add(currentSentence.toString());
                    currentSentence = new StringBuilder();
                    len = 0;
                }

            } else {
                // only consider sentences if : comes after at least 6 words from start of sentence
                if (punctuation.matches("[!?]") || (punctuation.compareTo(":") == 0 && len > 6)) {
                    // a sentence break
                    currentSentence.append(sentence);
                    currentSentence.append(punctuation);
                    currentSentence.append(stuffAfterPeriod.trim());
                    sentences.add(currentSentence.toString());
                    currentSentence = new StringBuilder();
                    len = 0;
                } else {
                    // not a sentence break
                    currentSentence.append(sentence);
                    currentSentence.append(punctuation);
                    if (stuffAfterPeriod.indexOf('\031') == -1) {
                        currentSentence.append(' ');
                    }
                }
            }
        }

        if (end < text.length()) {
            // There may be something after the last sentence.
            String lastPart = text.substring(end);
            if (!lastPart.isEmpty()) {
                currentSentence.append(lastPart);
            }
        }

        // If currentSentence is not empty (e.g. break at abbrev), add it to the results.
        if (currentSentence.length() > 0) {
            sentences.add(currentSentence.toString().trim());
        }

        String[] result = new String[sentences.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = sentences.get(i).replaceAll("\031", "");
        }
        
        return result;
    }
