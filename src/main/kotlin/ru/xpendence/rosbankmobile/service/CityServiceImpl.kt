package ru.xpendence.rosbankmobile.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.xpendence.rosbankmobile.dto.CityDto
import ru.xpendence.rosbankmobile.dto.locate
import ru.xpendence.rosbankmobile.mapper.CityMapper
import ru.xpendence.rosbankmobile.repository.CityRepository
import ru.xpendence.rosbankmobile.util.CityUtils
import javax.persistence.EntityNotFoundException

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 15:04
 * e-mail: slava_rossii@list.ru
 */
@Service
class CityServiceImpl : CityService {
    @Autowired
    private lateinit var repository: CityRepository

    @Autowired
    private lateinit var mapper: CityMapper

    override fun getByPhone(phone: String): CityDto {
        val city = recognizeCityByNumber(phone)
        return mapper.toDto(repository.getByCity(city)
                ?: repository.getByRegion(city)
                ?: throw EntityNotFoundException("Город $city не найден.")).locate()
    }

    override fun recognizeCityByNumber(phone: String): String = CityUtils.recognizeCity(phone)

}
