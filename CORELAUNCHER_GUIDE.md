# CoreLauncher — mobile setup and performance notes

This source tree is branded as CoreLauncher and includes a landscape launcher layout, subtle entrance animations, and multi-file `.jar` mod import.

## Put the project in your phone's Downloads folder

1. Download the project ZIP and extract it with Files or ZArchiver.
2. The extracted folder should be `CoreLauncher/`.
3. Open that folder in Android Studio on a PC to build. Building directly on a phone requires a compatible Android SDK/NDK and enough free storage; this ZIP is source code, not an APK.

## Importing mods in the app

1. Launch the game once with the target Minecraft profile and correct mod loader installed (Fabric/Forge/NeoForge, depending on the mod).
2. In CoreLauncher, tap **Import Mods (.jar)** and select one or more `.jar` mod files from Downloads.
3. The app copies accepted `.jar` files into the selected profile's `mods` directory. If a filename already exists, it keeps the old file and adds a numbered copy.
4. Make sure each mod matches the Minecraft version, loader, and Java version. Resource packs belong in `resourcepacks`, not `mods`.

Only install mods from sources you trust. This import button copies files; it does not verify mod safety or compatibility.

## Performance starting point for low-memory phones

- Start with render distance 4–6 chunks and simulation distance 4 chunks.
- Set graphics to Fast, clouds off, particles minimal, and use a 30–45 FPS cap first.
- Prefer compatible performance mods such as Sodium where supported. Avoid conflicting renderer mods.
- Use default textures or a lightweight resource pack; high-resolution packs consume more memory.
- Keep storage free and close heavy background apps.

**FPS note:** 45–50 FPS on every 3 GB RAM phone cannot be guaranteed. GPU, thermals, Minecraft version, renderer, resolution, world complexity, and mods all matter. Validate on the actual device.

## Build status

This package is a modified source project, not a prebuilt APK. It has not been verified on a physical 3 GB RAM phone.

## Upstream attribution

CoreLauncher is based on the included upstream project source. Preserve its license, copyright notices, and third-party licenses when distributing builds. This branding does not imply affiliation with ZalithLauncher or the upstream project authors.

## Exact phone folder path

Extract the source project to `/storage/emulated/0/Download/CoreLauncher/` (Internal storage → Download → CoreLauncher). This is the source folder, not the app's private runtime data directory. Android 10+ scoped-storage rules prevent an app from silently moving all private runtime files into Downloads.
