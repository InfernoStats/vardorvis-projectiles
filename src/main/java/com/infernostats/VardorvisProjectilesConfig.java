package com.infernostats;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(VardorvisProjectilesConfig.GROUP)
public interface VardorvisProjectilesConfig extends Config
{
	String GROUP = "vardorvis-projectiles";

	@Getter
	@AllArgsConstructor
	enum Style
	{
		Inferno(1378, 1380),
		CoX(1343, 1341),
		ToB(1607, 1606),
		ToA(2241, 2224);

		private final int range;
		private final int magic;
	}

	@ConfigItem(
		keyName = "style",
		name = "Projectile Style",
		description = "The message to show to the user when they login"
	)
	default Style style()
	{
		return Style.CoX;
	}
}
