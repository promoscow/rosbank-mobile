package ru.xpendence.rosbankmobile.util

import kotlin.random.Random

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 16:17
 * e-mail: slava_rossii@list.ru
 */
class CityUtils {

    companion object {
        private val cities: List<String> = listOf("Москва", "Санкт-Петербург", "Казань", "Смоленск", "Тверь", "Тула")

        @JvmStatic
        fun recognizeCity(phone: String): String = cities[Random.nextInt(cities.size - 1)]
    }

}
