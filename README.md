# FrontInBack

Пример для статьи (https://habr.com/ru/articles/875546/) на хабре на тему упаковки и развёртывания фронта внутри бэка.\
Иллюстрация возможности развернуть фронт на основе встроенного в spring web-сервера.\

Может быть полезно если

- Если вы DevOps, настраиваете CI/CD, но не хотите заморачиваться со стендами и докерами.
- Если вы разработчик и от вас требуют саморазвёртывающийся дистрибутив который сможет установить любая бабушка. Что может быть проще чем просто запустить jar-файл и открыть браузер? Кстати, браузер тоже можно запускать автоматически, при запуске jar- ника.
- Наконец реальный случай из практики. Требовалось развёртывать и время от времени обновлять приложение на нескольких изолированных машинах в секретных комнатах имеющих только канал к общей базе данных. Соответственно развёртывать на каждой отдельной машине (а это, на минутку, винда не самых последних версий) фронт и бэк кажется очень излишним.\
Тем более, что общее количество пользователей не превышало двух десятков человек, а одновременно работали примерно 3 - 5 человек.\
И да, доступа в секретную комнату не имелось, то есть всё через третьи руки.


Описание проектов

- back-web-server - проект бэка (gradle). Spring Web + Swagger. В него мы будем вставлять наш фронт.
- front-js - проект фронта на чистом js
- front-angular - проект фронта на ангуляре.
