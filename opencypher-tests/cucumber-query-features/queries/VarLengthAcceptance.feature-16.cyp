MATCH (a:A)
MATCH (a)-[:LIKES*..1]->(c)
RETURN c.name
