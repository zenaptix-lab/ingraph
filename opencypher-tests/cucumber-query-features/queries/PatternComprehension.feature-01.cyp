MATCH (liker)
RETURN [p = (liker)--() | p] AS isNew
ORDER BY liker.time
