FROM node:7.9

RUN npm install -g json-server
ADD db.json /api/db.json

WORKDIR /api

EXPOSE 3000

HEALTHCHECK --interval=5s --timeout=3s --retries=3 \
      CMD curl -f http://localhost:3000 || exit 1

ADD entrypoint.sh /api/entrypoint.sh
CMD ./entrypoint.sh
