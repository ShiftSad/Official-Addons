package xyz.xenondevs.nova.addon.vanillahammers.registry

import xyz.xenondevs.nova.addon.registry.AddonHolder
import xyz.xenondevs.nova.addon.registry.ToolTierRegistry
import xyz.xenondevs.nova.addon.vanillahammers.VanillaHammers
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object ToolTiers : ToolTierRegistry, AddonHolder by VanillaHammers {
    
    val EMERALD = registerToolTier("emerald")
    val LAPIS = registerToolTier("lapis")
    val QUARTZ = registerToolTier("quartz")
    val OBSIDIAN = registerToolTier("obsidian")
    val PRISMARINE = registerToolTier("prismarine")
    val FIERY = registerToolTier("fiery")
    val SLIME = registerToolTier("slime")
    val ENDER = registerToolTier("ender")
    
}