package com;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.DefaultMetalTheme;

public class SolidTheme extends DefaultMetalTheme {

	public String getName() {

		return "Inside Solid";
	}

	private final ColorUIResource primary1 = new ColorUIResource(0, 0, 0);
	private final ColorUIResource primary2 = new ColorUIResource(220, 220, 220);
	private final ColorUIResource primary3 = new ColorUIResource(230, 230, 230);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }

}
