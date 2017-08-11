external class console {
  fun log(vararg any: Any)
}

var handle: (
        event: Any?,
        context: Any?,
        callback: (err: String?, result: String?) -> Unit
) -> Unit = {event, context, callback ->
  console.log("event: ${event}, context: ${context}")
  callback(null, "Success!")
}
