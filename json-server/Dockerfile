FROM node:8.12.0

WORKDIR /api

RUN npm install -g json-server
COPY db.json /api/db.json

EXPOSE 3000

CMD json-server --watch /api/db.json --host 0.0.0.0
