@Override
    public ContentElement parse(XmlPullParser parser, int initialDepth, XmlEnvironment xmlEnvironment)
            throws XmlPullParserException, IOException, SmackParsingException {
        ContentElement.Builder builder = ContentElement.builder();

        while (true) {
            XmlPullParser.Event tag = parser.next();
            if (tag == XmlPullParser.Event.START_ELEMENT) {
                String name = parser.getName();
                switch (name) {
                    case ToAffixElement.ELEMENT:
                        parseToAffix(parser, builder);
                        break;

                    case FromAffixElement.ELEMENT:
                        parseFromAffix(parser, builder);
                        break;

                    case TimestampAffixElement.ELEMENT:
                        parseTimestampAffix(parser, builder);
                        break;

                    case RandomPaddingAffixElement.ELEMENT:
                        parseRPadAffix(parser, builder);
                        break;

                    case PayloadElement.ELEMENT:
                        parsePayload(parser, xmlEnvironment, builder);
                        break;

                    default:
                        parseCustomAffix(parser, xmlEnvironment, builder);
                        break;
                }
            } else if (tag == XmlPullParser.Event.END_ELEMENT) {
                if (parser.getDepth() == initialDepth) {
                    break;
                }
            }
        }
        return builder.build();
    }
