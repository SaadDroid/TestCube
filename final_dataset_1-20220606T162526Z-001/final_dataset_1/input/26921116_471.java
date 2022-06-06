public double logp(int[] o, int[] s) {
        if (o.length != s.length) {
            throw new IllegalArgumentException("The observation sequence and state sequence are not the same length.");
        }

        int n = s.length;
        double p = MathEx.log(pi[s[0]]) + MathEx.log(b.get(s[0], o[0]));
        for (int i = 1; i < n; i++) {
            p += MathEx.log(a.get(s[i - 1], s[i])) + MathEx.log(b.get(s[i], o[i]));
        }

        return p;
    }
