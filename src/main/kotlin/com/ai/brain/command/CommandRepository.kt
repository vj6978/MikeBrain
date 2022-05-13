package com.ai.brain.command

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CommandRepository : MongoRepository<CommandEntity, String>