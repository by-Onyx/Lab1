package com.example.lab1

object DataGenerator {

    fun getCards(): List<ContentCards> {
        return listOf(
            BigContentCard(
                id = "Большое интересно 1",
                header = "Заголовок 1",
                subheader = "Подзаголовок 1",
                description = "Тут действительно много слов, но все они создают смысловую нить. " +
                        "Напоминает тот случай, когда рассказываешь историю и не можешь остановиться, " +
                        "добавляя все новые детали. Представь, что это как запутанная тропинка в лесу" +
                        " и каждое слово - это след. Надеюсь, ты не потерялся в этом лесу слов!"
            ),
            LittleContentCard(
                id = "Маленькое интересно 1",
                header = "Заголовок 2",
                subheader = "Подзаголовок 2"
            ),
            BigContentCard(
                id = "Большое интересно 2",
                header = "Заголовок 3",
                subheader = "Подзаголовок 3",
                description = "Это как волшебная шкатулка слов, открываешь её, и внутри целый мир смыслов и идей." +
                        " Вроде бы обычный текст, но в каждом предложении мерцает какая-то искорка интересного." +
                        " Может быть, здесь спрятан секрет вечной радости, и нам всем нужно всего лишь" +
                        " прочитать его до конца?"
            ),
            LittleContentCard(
                id = "Маленькое интересно 2",
                header = "Заголовок 4",
                subheader = "Подзаголовок 4"
            ),
            BigContentCard(
                id = "Большое интересно 3",
                header = "Заголовок 5",
                subheader = "Подзаголовок 5",
                description = "Тут просто масса слов, как если бы кто-то решил пересказать " +
                        "всю энциклопедию в одном предложении. Наверняка в этом тексте спрятаны " +
                        "все ответы на главные вопросы жизни, но их найти среди этой словесной кашы" +
                        " — задача не из легких. Надеюсь, хоть какой-то ответ приручится под твоим взором!"
            )
        )
    }
}