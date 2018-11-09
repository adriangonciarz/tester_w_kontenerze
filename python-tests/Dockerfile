FROM python:3.7.0-slim-stretch

WORKDIR /tests

COPY ["requirements.txt", "conftest.py", "test_1.py", "wait-for.sh", "./"]

RUN pip install -r requirements.txt
RUN mkdir reports/

CMD pytest -v test_1.py --html=reports/report.html