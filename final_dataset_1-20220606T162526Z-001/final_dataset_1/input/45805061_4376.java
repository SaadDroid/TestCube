public void addCurrency(final Currency ccyToAdd, final Currency ccyReference, final double fxRate) {
    ArgumentChecker.notNull(ccyToAdd, "Currency to add to the FX matrix should not be null");
    ArgumentChecker.notNull(ccyReference, "Reference currency should not be null");
    ArgumentChecker.isTrue(!ccyToAdd.equals(ccyReference), "Currencies should be different");
    if (_nbCurrencies == 0) { // FX Matrix is empty.
      _currencies.put(ccyReference, 0);
      _currencies.put(ccyToAdd, 1);
      _fxRates = new double[2][2];
      _fxRates[0][0] = 1.0;
      _fxRates[1][1] = 1.0;
      _fxRates[1][0] = fxRate;
      _fxRates[0][1] = 1.0 / fxRate;
      _nbCurrencies = 2;
    } else {
      ArgumentChecker.isTrue(_currencies.containsKey(ccyReference), "Reference currency {} not in the FX matrix", ccyReference);
      ArgumentChecker.isTrue(!_currencies.containsKey(ccyToAdd), "New currency {} already in the FX matrix", ccyToAdd);
      _currencies.put(ccyToAdd, _nbCurrencies);
      _nbCurrencies++;
      final double[][] fxRatesNew = new double[_nbCurrencies][_nbCurrencies];
      // Copy the previous matrix
      for (int loopccy = 0; loopccy < _nbCurrencies - 1; loopccy++) {
        System.arraycopy(_fxRates[loopccy], 0, fxRatesNew[loopccy], 0, _nbCurrencies - 1);
      }
      fxRatesNew[_nbCurrencies - 1][_nbCurrencies - 1] = 1.0;
      final int indexRef = _currencies.get(ccyReference);
      for (int loopccy = 0; loopccy < _nbCurrencies - 1; loopccy++) {
        fxRatesNew[_nbCurrencies - 1][loopccy] = fxRate * _fxRates[indexRef][loopccy];
        fxRatesNew[loopccy][_nbCurrencies - 1] = 1.0 / fxRatesNew[_nbCurrencies - 1][loopccy];
      }
      _fxRates = fxRatesNew;
    }
  }
