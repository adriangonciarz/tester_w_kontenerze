## Materiały

### Przydatne Linki
Dobry tutorial z budowania obrazów:

https://rominirani.com/docker-tutorial-series-part-5-building-your-own-docker-images-b4a448b44afc

O testowaniu z użyciem Dockera:

https://alexei-led.github.io/post/docker_testing/

http://blog.florian-hopf.de/2018/02/service-testing-docker-containers.html

O testowaniu w Dockerze z Selenium i Headless Chrome
https://medium.freecodecamp.org/a-recipe-for-website-automated-tests-with-python-selenium-headless-chrome-in-docker-8d344a97afb5

Serwer do testów API
https://github.com/typicode/json-server

Kontrolowanie kolejności uruchomienia w Docker-Compose
https://docs.docker.com/compose/startup-order/


### Cwiczenia

#### Cwiczenie 1

* Uzytkownik 1: uruchomić w trybie interaktywnym obraz pythona z bashem
* U1: Zainstalować `pip install pytest`
* Uzytkownik 2: Wejść do kontenera 
* U2: Uruchomić komendę `pytest`
* U2: Wyjść z kontenera
* U2: Zatrzymać kontener
* U2: Usunąć kontener

#### Cwiczenie 2
Stwórz `Dockerfile`, który:
1. Bazuje na ubuntu:18.04, z `WORKDIR /myubuntu`
2. Zrobi `apt-get update`
3. Zainstaluje `apt-get install nano`
4. Skopiuje 2 pliki tekstowe z folderu do obrazu

Potem:
Zbuduj obraz z tagiem `imienaziwsko/custom-ubuntu:1.0.0`
Odpal obraz i zedytuj plik za pomocą nano

Poprawny Dockerfile:

```
FROM ubuntu:18.04

WORKDIR /myubuntu
RUN apt-get update && apt-get install nano

COPY aaa.txt ./

CMD /bin/bash
```

