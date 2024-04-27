package com.oneotrix.javarxtesting.domain.repository

interface Repository {

    fun getRepositories()

    fun getRepositoryByTitle(title: String)

    fun downloadRepositoryByLink(link: String)
}