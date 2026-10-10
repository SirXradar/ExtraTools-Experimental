# ExtraTools-Experimental

A Slimefun4 addon that adds useful tools and machines to enhance your gameplay.

### Forked for Slimefun4 Experimental (4.9-UNOFFICIAL)

This fork is maintained by [SirXradar](https://github.com/SirXradar) and has been updated to work with Slimefun4 Experimental.

## Features

### Tools
- **Hammer** - Pulverizes blocks into dust and powdered forms

### Machines
- **Gold Transmuter** - Multiplies gold ingots and steel ingots
- **Electric Composter** (T1, T2) - Converts organic food into fertilizer
- **Cobblestone Generator** - Generates cobblestone from lava and water
- **Vaporizer** - Processes water bottles, potions, and lava buckets
- **Concrete Factory** - Converts concrete powder and terracotta into concrete
- **Pulverizer** - Processes various blocks into more useful materials

## Requirements

- Minecraft 1.21.1+
- PaperMC
- Slimefun4 Experimental 4.9-UNOFFICIAL
- InfinityLib 1.3.9

## Installation

1. Download the latest release JAR from the [GitHub Releases](https://github.com/SirXradar/ExtraTools-Experimental/releases) or [SpigotMC](https://www.spigotmc.org/resources/extratools-experimental.12345/)
2. Place the JAR file into your `plugins/Slimefun/addons/` folder
3. Restart or reload your server

## Building from Source

```bash
git clone https://github.com/SirXradar/ExtraTools-Experimental.git
cd ExtraTools-Experimental
mvn clean package
```

The compiled JAR will be in `target/ExtraTools-Experimental-V1.jar`.

## Configuration

The plugin includes a `config.yml` file with the following options:

```yaml
options:
  auto-update: true
```

## Credits

- Original addon by [Sfiguz7](https://github.com/Sfiguz7) and [Alessio-Colombo](https://github.com/Alessio-Colombo)
- Forked and updated for Slimefun4 Experimental by [SirXradar](https://github.com/SirXradar)
- [Slimefun4 Experimental](https://github.com/SlimefunExperimental/Slimefun4)
- [InfinityLib](https://github.com/Mooy1/InfinityLib)

## License

This project is licensed under the GNU General Public License v3.0.
