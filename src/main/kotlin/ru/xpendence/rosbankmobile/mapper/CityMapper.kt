package ru.xpendence.rosbankmobile.mapper

import org.springframework.stereotype.Component
import ru.xpendence.rosbankmobile.dto.CityDto
import ru.xpendence.rosbankmobile.entity.City

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 14:56
 * e-mail: slava_rossii@list.ru
 */
@Component
class CityMapper {

    fun toDto(entity: City): CityDto = CityDto(entity.latitude, entity.longitude)
}
