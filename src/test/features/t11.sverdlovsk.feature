# language: ru
@all @t11
Функция: Тестирование доступности демо режима в регионе Свердловская область
  Сценарий: Проверка демо режима в регионе Свердловская область
    Дано  Открыть сайт к-Врачу
    Также Перейти в регион "Свердловская область"
    Если  Регион успешно открылся
    То    Включить демо режим
    Если  Демо режим влючен
    То    Записаться к врачу
    Также Выключить Демо режим
