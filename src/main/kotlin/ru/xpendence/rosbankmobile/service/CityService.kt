package ru.xpendence.rosbankmobile.service

import ru.xpendence.rosbankmobile.dto.CityDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 15:03
 * e-mail: slava_rossii@list.ru
 */
interface CityService {

    fun getByCity(city: String): CityDto
}
