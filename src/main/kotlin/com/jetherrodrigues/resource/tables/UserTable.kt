package com.jetherrodrigues.resource.tables

import org.jetbrains.exposed.sql.Table

object UserTable : Table() {
    val id = ulid("id").primaryKey()
    val name = varchar("name", 36)
    val email = varchar("email", 36)
}