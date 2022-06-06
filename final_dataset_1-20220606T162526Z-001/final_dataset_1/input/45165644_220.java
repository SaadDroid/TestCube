@Override
    public List<Wizard> findWizardsWithSpellbook(String name) {
        Spellbook spellbook = spellbookDao.findByName(name);
        return new ArrayList<>(spellbook.getWizards());
    }
