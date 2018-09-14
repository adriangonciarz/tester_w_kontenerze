FROM python:3.7.0-slim-stretch

WORKDIR /tests

COPY ["requirements.txt", "test_1.py", "./"]
ENV BASE_URI=http://jsonplaceholder.typicode.com

RUN pip install -r requirements.txt
RUN mkdir reports/

CMD pytest -v test_1.py --html=reports/report.html