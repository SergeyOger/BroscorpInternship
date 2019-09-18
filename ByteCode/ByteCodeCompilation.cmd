javac -d bin src/com/zmex/byteCodeExample/user/User.java
javac -sourcepath ./src -d bin src/com/zmex/byteCodeExample/ByteCodeExample.java
java -classpath ./bin com/zmex/byteCodeExample/ByteCodeExample
javap -v bin/com/zmex/byteCodeExample/ByteCodeExample