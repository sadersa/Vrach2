# language: ru
@all @t4
Функция: Тестирование доступности демо режима в регионе Пермский край
  Сценарий: Проверка демо режима в регионе Пермский край
    Дано  Открыть сайт к-Врачу
    Также Перейти в регион "Пермский край"
    Если  Регион успешно открылся
    То    Включить демо режим
    Если  Демо режим влючен
    То    Записаться к врачу
    Также Выключить Демо режим