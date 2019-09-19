#! /bin/bash
set -ex

COVERITY_IDIR=scan/cov-idir

cov-build --dir ${COVERITY_IDIR} mvn -Dmaven.test.skip=true -DskipTests -Dmaven.compiler.fork=true clean install

mkdir -p scan/results
cp ${COVERITY_IDIR}/BUILD* scan/results
cp ${COVERITY_IDIR}/build* scan/results
 
cov-manage-emit --dir ${COVERITY_IDIR} --tu-pattern "file('src/main/java')" list

cov-analyze \
  --dir ${COVERITY_IDIR} \
  --all \
  --strip-path `pwd`

cov-commit-defects \
  --host gide-phxld1a.vmpc1.cloud.boeing.com \
  --dataport 9090 \
  --ssl \
  --certs /etc/pki/ca-trust/source/anchors/Boeing_CA_Certs.pem \
  --scm git \
  --auth-key-file ${COV_KEY} \
  --dir ${COVERITY_IDIR} \
  --stream '[Dev]ContainerTest' \
  --description ${CI_PIPELINE_ID}