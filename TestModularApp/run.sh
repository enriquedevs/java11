
#!/usr/bin/env bash
$JAVA_HOME/bin/javac -d mods/mymodule src/mymodule/module-info.java src/mymodule/com/app/main/Main.java
$JAVA_HOME/bin/java -p mods -m mymodule/com.app.main.Main
