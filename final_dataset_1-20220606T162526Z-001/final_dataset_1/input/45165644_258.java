public static void main(String[] args) {

        Character warrior =
                CharacterStepBuilder.newBuilder().name("Amberjill").fighterClass("Paladin")
                        .withWeapon("Sword").noAbilities().build();

        LOGGER.info(warrior.toString());

        Character mage =
                CharacterStepBuilder.newBuilder().name("Riobard").wizardClass("Sorcerer")
                        .withSpell("Fireball").withAbility("Fire Aura").withAbility("Teleport")
                        .noMoreAbilities().build();

        LOGGER.info(mage.toString());

        Character thief =
                CharacterStepBuilder.newBuilder().name("Desmond").fighterClass("Rogue").noWeapon().build();

        LOGGER.info(thief.toString());
    }
