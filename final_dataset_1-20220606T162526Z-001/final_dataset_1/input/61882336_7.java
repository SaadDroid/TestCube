@RequestMapping(value = "/grid-data", method = RequestMethod.GET)
    public @ResponseBody List<GridRowDTO> getGrid() {
        LOGGER.info("get data for grid view", DemoController.class);

        List<GridRowDTO> gridRowDTOs = new ArrayList<GridRowDTO>();
        gridRowDTOs.add(new GridRowDTO(1, "Barbarian Queen", "Neutral Evil"));
        gridRowDTOs.add(new GridRowDTO(2, "Global Senior Vice President of Sales", "Chaotic Evil"));
        gridRowDTOs.add(new GridRowDTO(3, "Jonathan the Piggy", "Glorious Good"));
        gridRowDTOs.add(new GridRowDTO(4, "Paladin Knight", "Lawful Good"));
        gridRowDTOs.add(new GridRowDTO(5, "Potato Chip", "Radiant Good"));

        return gridRowDTOs;
    }
