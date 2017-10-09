FROM maven:3.5.0-jdk-8

ADD . /test-code
ADD test.sh /test.sh
ENTRYPOINT ["bash", "/test.sh"]
