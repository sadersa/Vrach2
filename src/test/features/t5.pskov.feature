# language: ru
@all @t5
Функция: Тестирование доступности демо режима в регионе Псковская область
  Сценарий: Проверка демо режима в регионе Псковская область
    Дано  Открыть сайт к-Врачу
    Также Перейти в регион "Псковская область"
    Если  Регион успешно открылся
    То    Включить демо режим
    Если  Демо режим влючен
    То    Записаться к врачу
    Также Выключить Демо режим