# TarafficGo

![Image](https://github.com/user-attachments/assets/1f20429d-de6a-4cc4-b898-24de20eb2a34)

Have you ever been stuck in traffic and wished you could do something to fix it? In Mini Motorways, the city’s traffic problems are in your hands.


From the makers of Mini Metro, Mini Motorways is a game about drawing the roads that drive a growing city. Build a road network, one road at a time, to create a bustling metropolis. Redesign your city to keep the traffic flowing, and carefully manage upgrades to meet the changing demands. How long can you keep the cities of the world moving?


Features:


• Draw roads in dynamic cities that grow and change - every game is unique!

• Explore stunning maps inspired by cities all around the world.

• Choose from a variety of upgrades to meet the demands of your ever-expanding road network: highways, roundabouts, and more!

• Stress-free Endless Mode offers you a relaxing gameplay experience, plus you can continue building your city after Game Over.

• Tackle our Expert Mode, which features twists such as permanent roads and limited upgrades for the ultimate challenge.

• Select different colour palettes on every map including colourblind and night modes.

• Relax to a responsive soundtrack from Disasterpeace that grows along with your city.

• Unlock new maps and achievements as you achieve mastery.

• Export GIFs of your city layouts to share with your friends.

• Compete against other players in Daily and Weekly Challenges.

• Compatible with Siri Remote, Bluetooth and MFi controllers.



A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

This project was generated with a template including simple application launchers and a main class extending `Game` that sets the first screen.

## Platforms

- `core`: Main module with the application logic shared by all platforms.
- `lwjgl3`: Primary desktop platform using LWJGL3; was called 'desktop' in older docs.
- `android`: Android mobile platform. Needs Android SDK.

## Gradle

This project uses [Gradle](https://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `android:lint`: performs Android project validation.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.
