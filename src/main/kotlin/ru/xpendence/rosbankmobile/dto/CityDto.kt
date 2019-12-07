package ru.xpendence.rosbankmobile.dto

import java.io.Serializable

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 14:55
 * e-mail: slava_rossii@list.ru
 */
data class CityDto(var latitude: String?, var longitude: String?) : Serializable

fun CityDto.locate(): CityDto {
    val other = kotlin.random.Random.nextDouble(-0.1, 0.1)
    this.latitude = this.latitude!!.toDouble().plus(other).toString()
    this.longitude = this.longitude!!.toDouble().plus(other).toString()
    return this
}
