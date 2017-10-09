#!/bin/bash
ENDPOINT=${API_ENDPOINT:-http://localhost}
PORT=${API_PORT:-3000}

cd /test-code
mvn test -Dapi.endpoint=$ENDPOINT -Dapi.port=$PORT
mvn surefire-report:report-only
mvn site -DgenerateReports=false

cp -rf /test-code/target/site/* /reports