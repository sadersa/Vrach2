# language: ru
@all @t6
Функция: Тестирование доступности демо режима в регионе Республика Башкортостан
  Сценарий: Проверка демо режима в регионе Республика Башкортостан
    Дано  Открыть сайт к-Врачу
    Также Перейти в регион "Республика Башкортостан"
    Если  Регион успешно открылся
    То    Включить демо режим
    Если  Демо режим влючен
    То    Записаться к врачу
    Также Выключить Демо режим