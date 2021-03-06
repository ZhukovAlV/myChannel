Спроектировать систему публикации аудио и видео треков на разных платформах.

Сервисы и системы, с которыми необходимо работать
Платформы, в которых должны быть опубликованы треки (реализуют интерфейс PublishingChannel)
YandexMusicChannel (для аудио)
YoutubeMusicChannel (для аудио и видео)
ItunesChannel (для аудио)
Сервис RecordingDataHub для хранения исходных данных (сохраняет входящие файлы, возвращает новые ссылки). Использует:
хранилище аудио данных AudioRecordingStorage (реализует интерфейс DataStorage)
хранилище видео файлов VideoStorage (реализует интерфейс DataStorage)
Сервис PromotionService для создания рекламных кампаний

Основные бизнес объекты:
Recording - аудио/видео запись
артист
тип трека (аудио/видео)
название композиции
название альбома
год выпуска
ссылка на обложку альбома
жанр
продолжительность
ссылка на файл из хранилища

Детали интерфейсов
Интерфейс PublishingChannel
метод void publish(Recording, ZonedDateTime publishAvailableDate)
Интерфейс DataStorage
String save(String path)
Интерфейс PromotionService
void createCampaign(Recording, ZonedDateTime campaignCreateDate)


Задача:
Спроектировать классы, описывающие указанные интерфейсы. Реализовать  указанные связи между классами. Реализации методов может состоять только их вывода на экран текстовых сообщений с hard-coded значениями
Все зависимости классов должны быть реализованы при помощи Spring Dependency Injection. Передача параметров идет через интерфейсы (если таковые имеются).
Создать следующие сценарии (каждый сценарий реализован как CommandLineRunner):
Сохранение новой аудиозаписи в RecordingDataHub (AudioRecordingStorage)
Сохранение новой видеозаписи в RecordingDataHub (VideoStorage)
Публикация аудиозаписи в подходящие платформы и запуск рекламных кампаний через 1 неделю после публикации.
Публикация видеозаписи в подходящие платформы и запуск рекламных кампаний через 2 неделю после публикации.

