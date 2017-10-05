# Droga/i Uczestniczko/ku
W celu weryfikacji środowiska przed naszymi warszatami poproszę Cię o wykonanie kilku czynności. Najpierw upewnij się, że wykonałaś(eś) kroki o które prosiłem w pierwszym mailu (Wymagania) a potem przejdź do kroków w paragrafie Weryfikacja.

## Wymagania
### Wiedza
Oczekuję od Ciebie:
- znajomości podstaw języka Java oraz projektów Maven
- podstaw poruszania się w systemie Unix oraz komunikacji w API REST
- mile widziana znajomość podstaw GIT
Z uwagi na ograniczony czas warsztatów nie będzie czasu na tłumaczenie tych zagadnień od zera :(

### Narzędzia
Proszę o przyniesienie ze sobą komputera z systemem Unix (Mac/Linux) albo w ostateczności Windows z konsolą (Powershell, etc.)
Proszę o instalację:
- wybranego IDE (najlepiej IntelliJ https://www.jetbrains.com/idea/download)
- Java 8 + Maven
https://maven.apache.org/install.html
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- środowiska Docker 
https://docs.docker.com/docker-for-windows/install/
https://docs.docker.com/docker-for-mac/install/
https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu/

## Weryfikacja środowiska
1. Git:
- Sklonuj poniższe repozytorium `git clone git@github.com:adriangonciarz/dockers.git`
- Wejdź do folderu z repozytorium
2. Docker
- Wejdź do folderu `json-server-docker`
- Uruchom skrypt `build.sh`
- Wykonaj polecenie `docker images` i upewnij się, że znajduje się tam obraz `agonciarz/json-server:latest`
- Wyjdź do głównego folderu repozytorium
3. Maven
- Wejdź do folderu `test-code`
- Uruchom polecenie `mvn install -DskipTests`
- Upewnij się, że widnieje informacja *BUILD SUCCEEDED*

## W razie problemów
Pisz na mój adres email: *adrian.gonciarz@gmail.com* 