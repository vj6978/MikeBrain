package com.ai.brain.command

import mu.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/api/v1")
class CommandController(
    private val commandService: CommandService
)
{
    @PostMapping("/command")
    fun postCommand(@RequestBody commandDTO: CommandDTO): ResponseEntity<CommandResponseDTO>
    {
        logger.debug { "Incoming Command: ${commandDTO.command}" }
        val response = commandService.postCommandAndReturnParsedResponse(commandDTO)
        logger.debug { "Posted Command: $response" }
        return ResponseEntity.ok().body(response)
    }
}