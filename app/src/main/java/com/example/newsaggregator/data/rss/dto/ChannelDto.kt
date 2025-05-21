package com.example.newsaggregator.data.rss.dto

import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlElement
import nl.adaptivity.xmlutil.serialization.XmlSerialName

@Serializable
@XmlSerialName("channel")
data class ChannelDto(
    @XmlSerialName("title")
    @XmlElement(true)
    val title: String,

    @XmlSerialName("link")
    @XmlElement(true)
    val link: String,

    @XmlSerialName("description")
    @XmlElement(true)
    val description: String,

    @XmlSerialName("language")
    @XmlElement(true)
    val language: String,

    @XmlSerialName("copyright")
    @XmlElement(true)
    val copyright: String,

    @XmlSerialName("pubDate")
    @XmlElement(true)
    val pubDate: String,

    @XmlSerialName("date", "http://purl.org/dc/elements/1.1/", "dc")
    @XmlElement(true)
    val dcDate: String,

    @XmlSerialName("language", "http://purl.org/dc/elements/1.1/", "dc")
    @XmlElement(true)
    val dcLanguage: String,

    @XmlSerialName("rights", "http://purl.org/dc/elements/1.1/", "dc")
    @XmlElement(true)
    val dcRights: String,

    val image: ImageDto,

    val items: List<ItemDto>,
)