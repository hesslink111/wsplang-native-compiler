#!/usr/bin/env bash
set -ex

mvn clean install

$GRAALVM_HOME/bin/native-image --no-fallback -cp ./target/wsp-aot-1.0-SNAPSHOT-jar-with-dependencies.jar -H:Name=wsp_aot -H:Class=MainKt -H:+ReportUnsupportedElementsAtRuntime --initialize-at-build-time
