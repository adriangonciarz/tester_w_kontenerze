FROM maven:3.5.0-jdk-8-onbuild

ADD ../src /functional-tests/src
ADD ../pom.xml /functional-tests/pom.xml

ADD test.sh /test.sh
ENTRYPOINT ["bash", "/test.sh"]
