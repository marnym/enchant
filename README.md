# Enchant-Kotlin - A Kotlin wrapper for [Enchant](https://abiword.github.io/enchant/)

Enchant-Kotlin's goal is to provide an easy Kotlin API for the
C [Enchant Spellcheck Library](https://abiword.github.io/enchant/). It tries to provide an easy-to-use API, which
handles all resource management for you.

## Installation
Use your package manager to install `libenchant`. You also need to have some dictionary installed.

Currently, there is not any jar published anywhere, so you have to build it yourself (see [Building](#building)).

TODO: Publish to Maven Central repo

## Usage

```kotlin
import dev.nyman.enchant.Enchant

fun main() {
    val enchant = Enchant()
    val dict = enchant.loadDict("en_GB") ?: return
    
    println("obvious: ${dict.check("obvious")}")
    println("ovbious: ${dict.check("ovbious")}")
    println(dict.suggest("ovbious").joinToString(" "))
}
```

## Building

Clone this repo:
``` shell
git clone https://github.com/masnen/enchant.git
```

Build with Gradle:
```shell
./gradlew build
```

The jar is built to `build/libs`
