@Override
    public Printer resolve(String name) {
        Printer printer = printers.get(name);
        return nonNull(printer) ? printer : printers.get(aliases.get(name));
    }
