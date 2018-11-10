# Docker Commands - notes
## Pull images from Dockerhub
`docker pull ubuntu:16.04` - pull the image of Ubuntu 16.04 

## Images
**`docker build -t tag_name dokerfile_path`** - build the image with tag `tag_name` from a Dockerfile in `dockerfile_path`

**`docker images`** - list all available images

**`docker rmi ubuntu:16.04`** - remove the image `ubuntu:16.04` from host

**`docker rmi ubuntu:16.04` --force** - remove the image forcing

**`docker rmi $(docker images --quiet --filter "dangling=true")`** remove all unnecessary images from host

## Containers
### Running new container
**`docker run ubuntu:16.04`** - run the container of Docker image `ubuntu:16.04`

**`docker run -d serverimage`** - run the container of Docker image `serverimage` as deamon (in background)

**`docker run -p3000:3000 ubuntu:16.04`** - run the container of Docker image `ubuntu:16.04` with exposed port 3000 to my local machine port 3000

**`docker run -v /my/local/path:/container/path ubuntu:16.04`** - run the container of Docker image `ubuntu:16.04` with my machine folder `/my/local/path` mounted to container path `/container/path`

**`docker run -it ubuntu:16.04 bash`** - run the container of Docker image `ubuntu:16.04` in interactive mode with bash console

### Listing containers
**`docker ps`** - list all running containers

**`docker ps -a`** - list all containers (even dead)

### Killing and removing container
**`docker stop containerID`** - stop running container with ID `containerID`

**`docker rm containerID`** - remove dead container `containerID`

**`docker rm $(docker ps -q -f status=exited)`** remove all exited containers

## Docker Compose
**`docker-compose up`** - run a composition according to `docker-compose.yml` (containers, networks, volumes, etc.)

**`docker-compose up -d`** - run a composition as deamon

**`docker-compose down`** - stop and clear a composition according to `docker-compose.yml`
