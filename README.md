# wsplang-native-compiler
Ahead-of-time compiler for wsp-lang. Tested on macOS only.

### Overview
Compiles a wsp file into a "native" executable. This is made possible by natively compiling the interpreter
with GraalVM Native-Image and performing the parsing step at build-time while leaving the evaluation step
for run-time.

### Usage instructions
1. Install graalvm ce (found at https://github.com/graalvm/graalvm-ce-builds/releases)
2. Compile the java application with `$ ./build.sh`
3. A native executable `wsp_aot` is generated.

### Results
```
$ time java -cp ./target/wsp-aot-1.0-SNAPSHOT-jar-with-dependencies.jar MainKt
real    0m0.189s
user    0m0.367s
sys     0m0.053s


$ time ./wsp_aot
...
real    0m0.010s
user    0m0.004s
sys     0m0.003s
```
