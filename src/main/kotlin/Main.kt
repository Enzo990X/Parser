package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {

    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    val doc: Document = Jsoup.connect(url).get()

    println(doc.title())

    for (element in doc.select(".sc-2aegk7-2")) {
        println(element.text())
    }
}