package ru.xpendence.rosbankmobile.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.xpendence.rosbankmobile.dto.CityDto
import ru.xpendence.rosbankmobile.service.CityService

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 15:25
 * e-mail: slava_rossii@list.ru
 */
@RestController
@RequestMapping("/cities")
class CityController {

    @Autowired
    private lateinit var service: CityService

    @GetMapping
    fun getByPhone(phone: String): ResponseEntity<CityDto> = ResponseEntity.ok(service.getByPhone(phone))
}
