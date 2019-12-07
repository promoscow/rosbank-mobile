package ru.xpendence.rosbankmobile.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.xpendence.rosbankmobile.entity.City

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 15:02
 * e-mail: slava_rossii@list.ru
 */
interface CityRepository : JpaRepository<City, Long> {

    fun getByCity(city: String): City?

    fun getByRegion(region: String): City?
}
