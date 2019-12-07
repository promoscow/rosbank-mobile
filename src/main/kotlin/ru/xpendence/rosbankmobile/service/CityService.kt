package ru.xpendence.rosbankmobile.service

import ru.xpendence.rosbankmobile.dto.CityDto

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 15:03
 * e-mail: slava_rossii@list.ru
 */
interface CityService {

    fun getByPhone(phone: String): CityDto

    fun recognizeCityByNumber(phone: String): String
}
