version = "0.2.9-alpha.3"

dependencies {
    implementation(project(":simple-upgrades"))
}

addon {
    name.set("Logistics")
    main.set("xyz.xenondevs.nova.addon.logistics.Logistics")
    version.set(project.version.toString())
    authors.addAll("StudioCode", "ByteZ", "Javahase")
    dependency("Simple_Upgrades")
}