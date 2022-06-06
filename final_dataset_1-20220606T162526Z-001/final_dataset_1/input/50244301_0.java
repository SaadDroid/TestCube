public boolean testEquals(@NotNull BasedSequence baseSeq, @NotNull Object o, int[] equalsCall) {
        equalsCall[0] = 0;
        if (o == baseSeq || o == baseSeq.getBase()) return true;
        if (!(o instanceof CharSequence)) return false;

        CharSequence other = (CharSequence) o;

        if (other.length() != baseSeq.length()) return false;

        if (o instanceof IRichSequence<?>) {
            IRichSequence<?> rich = (BasedSequence) o;
            equalsCall[0] = 1;
            if (rich.hashCode() != baseSeq.hashCode()) return false;

            //fall through to quickEquals tests then slow content comparison
        } else if (o instanceof String) {
            String string = (String) o;
            equalsCall[0] = 1;
            if (string.hashCode() != baseSeq.hashCode()) return false;

            //fall through to quickEquals tests then slow content comparison
        }

        // see if already have it in the weak hash map
        Boolean result;
        equalsCall[0] = 2;

        // no need to synchronize. Only called by Manager from synchronized code
        result = quickEquals.get(o);

        if (result != null) return result;

        if (baseSeq instanceof SubSequence && o instanceof String) {
            equalsCall[0] = 3;
            result = baseSeq.getBase().equals(o);
        } else if (baseSeq instanceof SubSequence && o instanceof SubSequence) {
            equalsCall[0] = 3;
            result = baseSeq.getBase().equals(((SubSequence) o).getBase());
        } else {
            equalsCall[0] = 4;
            result = baseSeq.equals(o);
        }

        quickEquals.put(o, result);

        return result;
    }
