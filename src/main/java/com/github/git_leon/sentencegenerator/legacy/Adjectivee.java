package com.github.git_leon.sentencegenerator.legacy;

import java.util.ArrayList;

public class Adjectivee {
	private static String[] colors = "blue,black,cyan,green,gray,maroon,purple,pink,red,scarlet,turquoise,violet,white"
			.split(",");
	private static String[] sensational = "smelly,stinky,pretty,moist,wet,dry,damp,hot,cold,tasty,gorgeous,exquisite"
			.split(",");
	private static String[] qualitative = "shining,".split(",");

	public static String getColor() {
		return Utils.randomItem(colors);
	}

	public static String random() {
		@SuppressWarnings("unchecked")
		ArrayList<String[]> adjectiveTypes = (ArrayList<String[]>) Utils.getFieldValues(new Adjectivee(),
				new String[0].getClass());
		String[] adjectives = Utils.randomItem(adjectiveTypes);
		return Utils.randomItem(adjectives);
	}
}
