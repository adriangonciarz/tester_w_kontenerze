# Droga/i Uczestniczko/ku
W celu weryfikacji środowiska przed naszymi warszatami poproszę Cię o wykonanie kilku czynności. Najpierw upewnij się, że wykonałaś(eś) kroki o które prosiłem w pierwszym mailu (Wymagania) a potem przejdź do kroków w paragrafie Weryfikacja.

## Wymagania
### Wiedza
Oczekuję od Ciebie:
- znajomości podstaw automatyzacji testów (najlepiej z użyciem Python)
- podstaw poruszania się w systemie Unix oraz komunikacji w API REST
- mile widziana znajomość podstaw GIT

Z uwagi na ograniczony czas warsztatów nie będzie czasu na tłumaczenie tych zagadnień od zera :(

### Narzędzia
Proszę o przyniesienie ze sobą komputera z systemem Unix (Mac/Linux) albo w ostateczności Windows z konsolą (Powershell, etc.)
Proszę o instalację:
- GITa https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
- Python3 https://realpython.com/installing-python/
- PyCharm Community (https://www.jetbrains.com/pycharm/download/)
- edytor tekstowy (Notepad++, Sublime, etc.)
- środowiska Docker

https://docs.docker.com/docker-for-windows/install/

https://docs.docker.com/docker-for-mac/install/

https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu/

## Weryfikacja środowiska
1. Git:
- Sklonuj poniższe repozytorium `git@github.com:adriangonciarz/tester_w_kontenerze.git` (jeśli masz konto GitHub i dodany klucz SSH: https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/) lub `git clone https://github.com/adriangonciarz/tester_w_kontenerze.git` jeśli nie chcesz używać SSH.
- Wejdź do folderu z repozytorium
2. Docker
- w konsoli uruchom polecenie `docker pull python:3.7.0-slim-stretch`
- Wejdź do folderu `json-server`
- Uruchom skrypt komendą `./build.sh`
- Wykonaj polecenie `docker images` i upewnij się, że znajdują się tam obrazy: 
`twk/json-server:latest` oraz `python:3.7.0-slim-stretch`

## W razie problemów
Pisz na mój adres email: *adrian.gonciarz@gmail.com* 
