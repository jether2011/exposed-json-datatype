package com.jetherrodrigues.resource

import org.jetbrains.exposed.sql.Database

object Database {
    fun connect() {
        Database.connect(
            url = "jdbc:postgresql://localhost:5432/users",
            driver = "org.postgresql.Driver",
            user = "postgres",
            password = "postgres123"
        )
    }
}