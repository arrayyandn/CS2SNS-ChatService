# CS2SNS-ChatService
A multi-user secure chat service built in Java using socket programming, SSL/TLS encryption, and additional security controls.

## Setup

### 1. Install JDK 25

> **Use JDK 25**, the newest long-term support (LTS) release, not an older or non-LTS one.

Download JDK 25 from either:

- [Eclipse Temurin](https://adoptium.net/temurin/releases/?version=25): free OpenJDK builds from the Eclipse Foundation.
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/): Oracle's own build, free to use.

Put JDK 25 first on your `PATH` and check `java -version` shows 25.

**Why LTS matters:** Java releases a new version every six months, and one every two years is LTS.

| Release type | Security updates |
|---|---|
| Non-LTS (23, 24, 26, …) | About six months, until the next version comes out |
| LTS (17, 21, 25, …) | Several years. JDK 25 is supported until at least Sept 2031 ([Temurin](https://adoptium.net/support)) and Sept 2030 ([Oracle](https://www.oracle.com/java/technologies/java-se-support-roadmap.html)) |

Once support ends, any security bug found later stays unfixed. For example, JDK 23's support ended in January 2025, so it never received the fix for [CVE-2025-21587](https://ubuntu.com/security/CVE-2025-21587), a high-severity (CVSS 7.4) flaw in JSSE, the TLS library we use for Level 2.

### 2. Open in VS Code

1. Install the **Extension Pack for Java** (VS Code offers it when you open the folder).
2. Put source files in `src/`. Compiled classes go to `bin/`, which git ignores.
3. Open a class with a `main` method and press **F5** to run it in the terminal.
