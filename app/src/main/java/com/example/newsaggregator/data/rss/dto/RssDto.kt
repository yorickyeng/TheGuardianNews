package com.example.newsaggregator.data.rss.dto

import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlElement
import nl.adaptivity.xmlutil.serialization.XmlSerialName

/*
class Rss<CHANNEL> private constructor(
    private val body: Body<CHANNEL>
) {
    constructor(data: CHANNEL) : this(Body(data))

    val data: CHANNEL get() = body.data

    @Serializable
    private data class Body<CHANNEL>(@Polymorphic val data: CHANNEL)

}

 */

@Serializable
@XmlSerialName("rss")
data class RssDto (
    val version: String,
    @XmlElement
    val channel: ChannelDto
)