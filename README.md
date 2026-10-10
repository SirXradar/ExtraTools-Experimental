# ExtraTools-Experimental

<a href="https://github.com/SirXradar/ExtraTools-Experimental">
  <img src="https://img.shields.io/github/v/release/SirXradar/ExtraTools-Experimental?label=Release&style=for-the-badge&color=green)">
</a>
<a href="https://github.com/SirXradar/ExtraTools-Experimental/blob/main/LICENSE">
  <img src="https://img.shields.io/github/license/SirXradar/ExtraTools-Experimental?label=License&style=for-the-badge&color=blue)">
</a>
<a href="https://www.spigotmc.org/resources/extratools-experimental.12345/">
  <img src="https://img.shields.io/badge/SpigotMC-Download-ffc800?style=for-the-badge&logo=java)" alt="SpigotMC">
</a>

> **ExtraTools** is a [Slimefun4](https://blob.build/project/Slimefun4/Experimental) addon that adds useful tools and machines to enhance your gameplay. This fork has been updated for **Slimefun4 Experimental (4.9-UNOFFICIAL)** by **SirXradar**.

---

## Features

### Tools
| Tool | Description |
|------|-------------|
| **Hammer** | Pulverizes blocks — stone → cobblestone, stone bricks → cracked variants |

### Machines
| Machine | Description |
|---------|-------------|
| **Gold Transmuter** | Converts iron → steel and steel → gold |
| **Electric Composter** (T1–T2) | Turns organic food into fertilizer |
| **Cobblestone Generator** | Generates cobblestone from lava + water |
| **Vaporizer** | Processes water bottles, potions, and lava |
| **Concrete Factory** | Converts concrete powder & terracotta into hardened concrete |
| **Pulverizer** | Crushes ores, stones, and end stone |

---

## Requirements

- **Minecraft:** 1.21+
- **Server Software:** [Paper](https://papermc.io/)
- **Core:** [Slimefun4 Experimental](https://blob.build/project/Slimefun4/Experimental)

> ✅ **InfinityLib is already shaded** into the JAR — no separate dependency needed.

---

## Installation

1. Download the latest release JAR: [`ExtraTools-Experimental-V1.jar`](https://github.com/SirXradar/ExtraTools-Experimental/releases)
2. Place it in your server's **`/plugins/`** folder.
3. Ensure **Slimefun4 Experimental** is also installed.
4. Start or restart your server.

---

## Usage

Place machines in the world, connect to power, and load with input items. The **Hammer** is used as a tool — right-click to pulverize blocks.

### Pulverizer (Example)
![Pulverizer Preview](https://via.placeholder.com/150x150.png/333333/ffffff?text=Pulverizer)

---

## Building from Source

```bash
git clone https://github.com/SirXradar/ExtraTools-Experimental.git
cd ExtraTools-Experimental
mvn clean package
```

The compiled JAR will be output to `target/ExtraTools-Experimental-V1.jar`.

---

## Configuration

Edit `config.yml` inside the JAR or at `plugins/ExtraTools/config.yml`:

```yaml
options:
  auto-update: true
```

---

## Credits

| Contributor | Role |
|-------------|------|
| [Sfiguz7](https://github.com/Sfiguz7) | Original creator |
| [Alessio-Colombo](https://github.com/Alessio-Colombo) | Original maintainer |
| [SirXradar](https://github.com/SirXradar) | Fork maintainer |

---

## Contact & Support

- **GitHub Issues:** https://github.com/SirXradar/ExtraTools-Experimental/issues
- **Telegram:** [@AmirrezaXR](https://t.me/SeniorIDE) / `t.me/SeniorIDE`

---

## License

This project is licensed under the **GNU General Public License v3.0** — see [LICENSE](LICENSE) for details.
