package ru.xpendence.rosbankmobile.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import kotlin.random.Random

/**
 * Author: Vyacheslav Chernyshov
 * Date: 07.12.19
 * Time: 14:46
 * e-mail: slava_rossii@list.ru
 */
@Entity
@Table(name = "cities")
data class City(

        @Id
        private val id: Long?,

        @Column(name = "postal_index")
        private val postalIndex: String?,

        @Column(name = "region_type")
        private val regionType: String?,

        @Column(name = "region")
        val region: String?,

        @Column(name = "district_type")
        private val districtType: String?,

        @Column(name = "district")
        private val district: String?,

        @Column(name = "city_type")
        private val cityType: String?,

        @Column(name = "city")
        val city: String?,

        @Column(name = "locality_type")
        private val localityType: String?,

        @Column(name = "locality")
        private val locality: String?,

        @Column(name = "cladr")
        private val cladr: String?,

        @Column(name = "fias")
        private val fias: String?,

        @Column(name = "fias_level")
        private val fiasLevel: String?,

        @Column(name = "sign")
        private val sign: String?,

        @Column(name = "okato")
        private val okato: String?,

        @Column(name = "oktmo")
        private val oktmo: String?,

        @Column(name = "ifns")
        private val ifns: String?,

        @Column(name = "timezone")
        private val timezone: String?,

        @Column(name = "latitude")
        val latitude: String?,

        @Column(name = "longitude")
        val longitude: String?,

        @Column(name = "federal_district")
        private val federalDistrict: String?,

        @Column(name = "population")
        private val population: String?
        )
