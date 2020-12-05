#!/usr/bin/env bash
set -xe

time java -cp ./target/wsp-aot-1.0-SNAPSHOT-jar-with-dependencies.jar MainKt

time ./wsp_aot
