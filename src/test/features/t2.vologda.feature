# language: ru
@all @t2
Функция: Тестирование доступности демо режима в регионе Вологодская область
  Сценарий: Проверка демо режима в регионе Вологодская область
    Дано  Открыть сайт к-Врачу
    Также Перейти в регион "Вологодская область"
    Если  Регион успешно открылся
    То    Включить демо режим
    Если  Демо режим влючен
    То    Записаться к врачу
    Также Выключить Демо режим