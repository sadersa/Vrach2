# language: ru
@all @t7
Функция: Тестирование доступности демо режима в регионе Республика Бурятия
  Сценарий: Проверка демо режима в регионе Республика Бурятия
    Дано  Открыть сайт к-Врачу
    Также Перейти в регион "Республика Бурятия"
    Если  Регион успешно открылся
    То    Включить демо режим
    Если  Демо режим влючен
    То    Записаться к врачу
    Также Выключить Демо режим