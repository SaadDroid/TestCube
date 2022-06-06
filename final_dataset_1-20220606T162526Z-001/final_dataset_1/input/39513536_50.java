public static Pattern catalysisPrecedes(Blacklist blacklist)
	{
		Pattern p = new Pattern(SequenceEntityReference.class, "first ER");
		p.add(linkedER(true), "first ER", "first generic ER");
		p.add(erToPE(), "first generic ER", "first simple controller PE");
		p.add(linkToComplex(), "first simple controller PE", "first controller PE");
		p.add(peToControl(), "first controller PE", "first Control");
		p.add(controlToConv(), "first Control", "first Conversion");
		p.add(new Participant(RelType.OUTPUT, blacklist, true), "first Control", "first Conversion", "linker PE");
		p.add(new NOT(new ConstraintChain(new ConversionSide(ConversionSide.Type.OTHER_SIDE), linkToSpecific())), "linker PE", "first Conversion", "linker PE");
		p.add(type(SmallMolecule.class), "linker PE");
		p.add(new ParticipatesInConv(RelType.INPUT, blacklist), "linker PE", "second Conversion");
		p.add(new NOT(new ConstraintChain(new ConversionSide(ConversionSide.Type.OTHER_SIDE), linkToSpecific())), "linker PE", "second Conversion", "linker PE");
		p.add(equal(false), "first Conversion", "second Conversion");

		// make sure that conversions are not replicates or reverse of each other
		// and also outward facing sides of reactions contain at least one non ubique
		p.add(new ConstraintAdapter(3, blacklist)
		{
			@Override
			public boolean satisfies(Match match, int... ind)
			{
				Conversion cnv1 = (Conversion) match.get(ind[0]);
				Conversion cnv2 = (Conversion) match.get(ind[1]);
				SmallMolecule linker = (SmallMolecule) match.get(ind[2]);

				Set<PhysicalEntity> input1 = cnv1.getLeft().contains(linker) ? cnv1.getRight() : cnv1.getLeft();
				Set<PhysicalEntity> input2 = cnv2.getLeft().contains(linker) ? cnv2.getLeft() : cnv2.getRight();
				Set<PhysicalEntity> output1 = cnv1.getLeft().contains(linker) ? cnv1.getLeft() : cnv1.getRight();
				Set<PhysicalEntity> output2 = cnv2.getLeft().contains(linker) ? cnv2.getRight() : cnv2.getLeft();

				if (input1.equals(input2) && output1.equals(output2)) return false;
				if (input1.equals(output2) && output1.equals(input2)) return false;

				if (blacklist != null)
				{
					Set<PhysicalEntity> set = new HashSet<PhysicalEntity>(input1);
					set = blacklist.getNonUbiques(set, RelType.INPUT);
					set.removeAll(output2);
					if (set.isEmpty())
					{
						set.addAll(output2);
						set = blacklist.getNonUbiques(set, RelType.OUTPUT);
						set.removeAll(input1);

						if (set.isEmpty()) return false;
					}
				}
				return true;
			}
		}, "first Conversion", "second Conversion", "linker PE");

		p.add(new RelatedControl(RelType.INPUT, blacklist), "linker PE", "second Conversion", "second Control");
		p.add(controllerPE(), "second Control", "second controller PE");
		p.add(new NOT(compToER()), "second controller PE", "first ER");
		p.add(linkToSpecific(), "second controller PE", "second simple controller PE");
		p.add(type(SequenceEntity.class), "second simple controller PE");
		p.add(peToER(), "second simple controller PE", "second generic ER");
		p.add(linkedER(false), "second generic ER", "second ER");
		p.add(equal(false), "first ER", "second ER");
		return p;
	}
