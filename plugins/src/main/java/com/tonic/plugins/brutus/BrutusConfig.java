package com.tonic.plugins.brutus;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("brutus")
public interface BrutusConfig extends Config
{
    @ConfigItem(
            keyName = "enabled",
            name = "Enable automation",
            description = "Master toggle for Brutus script",
            position = 0
    )
    default boolean enabled()
    {
        return false;
    }

    @ConfigItem(
            keyName = "bossName",
            name = "Boss name",
            description = "Name or partial name used to find Brutus",
            position = 1
    )
    default String bossName()
    {
        return "Brutus";
    }

    @ConfigItem(
            keyName = "bossAttackAction",
            name = "Boss attack action",
            description = "Action used to start fight with Brutus",
            position = 2
    )
    default String bossAttackAction()
    {
        return "Attack";
    }

    @ConfigItem(
            keyName = "restartTargetName",
            name = "Restart target name",
            description = "NPC/Object used to re-start the encounter after kill",
            position = 3
    )
    default String restartTargetName()
    {
        return "Brutus";
    }

    @ConfigItem(
            keyName = "restartAction",
            name = "Restart action",
            description = "Action used to restart fight (e.g. Fight, Start, Enter)",
            position = 4
    )
    default String restartAction()
    {
        return "Fight";
    }

    @ConfigItem(
            keyName = "lootList",
            name = "Loot list",
            description = "Comma-separated loot names to pick up",
            position = 5
    )
    default String lootList()
    {
        return "Rune, Dragon, Coins";
    }

    @ConfigItem(
            keyName = "lootRadius",
            name = "Loot radius",
            description = "Max tile distance to loot from",
            position = 6
    )
    default int lootRadius()
    {
        return 8;
    }

    @ConfigItem(
            keyName = "fightAreaRadius",
            name = "Fight area radius",
            description = "Only run combat/loot/restart logic when near Brutus (0 to disable)",
            position = 7
    )
    default int fightAreaRadius()
    {
        return 20;
    }

    @ConfigItem(
            keyName = "foodList",
            name = "Food list",
            description = "Comma-separated food names used for healing",
            position = 8
    )
    default String foodList()
    {
        return "Shark, Anglerfish, Manta ray, Karambwan";
    }

    @ConfigItem(
            keyName = "eatAtHpPercent",
            name = "Eat at HP %",
            description = "Eat when current HP percent is <= this value",
            position = 9
    )
    default int eatAtHpPercent()
    {
        return 55;
    }

    @ConfigItem(
            keyName = "weakHpPercent",
            name = "Emergency HP %",
            description = "Emergency teleport when HP percent is <= this value",
            position = 10
    )
    default int weakHpPercent()
    {
        return 25;
    }

    @ConfigItem(
            keyName = "noFoodTeleportOnlyInFightArea",
            name = "No-food TP only in fight area",
            description = "If enabled, no-food emergency teleport only triggers near Brutus",
            position = 11
    )
    default boolean noFoodTeleportOnlyInFightArea()
    {
        return true;
    }

    @ConfigItem(
            keyName = "potionList",
            name = "Potion list",
            description = "Comma-separated potion names to drink when low",
            position = 12
    )
    default String potionList()
    {
        return "Prayer potion, Super restore";
    }

    @ConfigItem(
            keyName = "drinkPrayerAt",
            name = "Drink at prayer",
            description = "Drink prayer potion when current prayer <= this level",
            position = 13
    )
    default int drinkPrayerAt()
    {
        return 15;
    }

    @ConfigItem(
            keyName = "teleportItem",
            name = "Emergency teleport item",
            description = "Inventory item used for emergency teleport",
            position = 14
    )
    default String teleportItem()
    {
        return "Royal seed pod";
    }

    @ConfigItem(
            keyName = "teleportAction",
            name = "Emergency teleport action",
            description = "Action for emergency teleport item",
            position = 15
    )
    default String teleportAction()
    {
        return "Commune";
    }

    @ConfigItem(
            keyName = "tickDelay",
            name = "Loop delay (ticks)",
            description = "Ticks to wait after each script action",
            position = 16
    )
    default int tickDelay()
    {
        return 2;
    }
}
