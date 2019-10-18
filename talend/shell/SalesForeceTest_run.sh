#!/bin/sh
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/ST4-4.0.7.jar:$ROOT_PATH/../lib/antlr-2.7.7.jar:$ROOT_PATH/../lib/antlr-runtime-3.5.jar:$ROOT_PATH/../lib/antlr4-runtime-4.6.jar:$ROOT_PATH/../lib/auto-common-0.3.jar:$ROOT_PATH/../lib/auto-service-1.0-rc2.jar:$ROOT_PATH/../lib/avro-1.8.1.jar:$ROOT_PATH/../lib/commons-beanutils-1.9.3.jar:$ROOT_PATH/../lib/commons-codec-1.10.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/commons-compress-1.8.1.jar:$ROOT_PATH/../lib/commons-lang3-3.8.1.jar:$ROOT_PATH/../lib/commons-logging-1.2.jar:$ROOT_PATH/../lib/components-api-0.27.3.jar:$ROOT_PATH/../lib/components-common-0.27.3.jar:$ROOT_PATH/../lib/components-common-oauth-0.27.3.jar:$ROOT_PATH/../lib/components-salesforce-definition-0.27.3.jar:$ROOT_PATH/../lib/components-salesforce-runtime-0.27.3.jar:$ROOT_PATH/../lib/crypto-utils.jar:$ROOT_PATH/../lib/daikon-0.31.7.jar:$ROOT_PATH/../lib/daikon-exception-0.31.7.jar:$ROOT_PATH/../lib/dom4j-1.6.1.jar:$ROOT_PATH/../lib/force-partner-api-46.0.0.jar:$ROOT_PATH/../lib/force-wsc-46.0.0.jar:$ROOT_PATH/../lib/guava-20.0.jar:$ROOT_PATH/../lib/httpclient-4.5.5.jar:$ROOT_PATH/../lib/httpcore-4.4.9.jar:$ROOT_PATH/../lib/jackson-annotations-2.9.0.jar:$ROOT_PATH/../lib/jackson-core-2.9.9.jar:$ROOT_PATH/../lib/jackson-core-asl-1.9.14-TALEND.jar:$ROOT_PATH/../lib/jackson-databind-2.9.9.jar:$ROOT_PATH/../lib/jackson-mapper-asl-1.9.14-TALEND.jar:$ROOT_PATH/../lib/javacsv-2.0.jar:$ROOT_PATH/../lib/javax.inject-1.jar:$ROOT_PATH/../lib/javax.servlet-api-3.1.0.jar:$ROOT_PATH/../lib/jcl-over-slf4j-1.7.25.jar:$ROOT_PATH/../lib/joda-time-2.8.2.jar:$ROOT_PATH/../lib/json-20140107.jar:$ROOT_PATH/../lib/json-io-4.9.9-TALEND.jar:$ROOT_PATH/../lib/log4j-1.2.17.jar:$ROOT_PATH/../lib/org.apache.oltu.oauth2.client-1.0.0.jar:$ROOT_PATH/../lib/org.apache.oltu.oauth2.common-1.0.0.jar:$ROOT_PATH/../lib/org.osgi.service.component.annotations-1.3.0.jar:$ROOT_PATH/../lib/paranamer-2.7.jar:$ROOT_PATH/../lib/pax-url-aether-2.4.7.jar:$ROOT_PATH/../lib/slf4j-api-1.7.25.jar:$ROOT_PATH/../lib/slf4j-log4j12-1.7.10.jar:$ROOT_PATH/../lib/snappy-java-1.1.1.3.jar:$ROOT_PATH/../lib/stringtemplate-3.2.1.jar:$ROOT_PATH/../lib/talend-codegen-utils.jar:$ROOT_PATH/../lib/talend_file_enhanced_20070724.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/../lib/xz-1.5.jar:$ROOT_PATH/salesforecetest_0_1.jar: test.salesforecetest_0_1.SalesForeceTest  --context=Default "$@"