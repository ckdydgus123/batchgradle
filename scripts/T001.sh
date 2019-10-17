#!/bin/bash

cd `dirname ${0}`
cd ../

source ./scripts/env/classpath.sh

java -cp "${CLASSPATH}" org.springframework.batch.core.launch.support.CommandLineJobRunner src/main/resource/META-INF/jobs/T001.xml T001
exit $?

