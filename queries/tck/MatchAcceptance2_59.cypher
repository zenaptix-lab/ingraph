MATCH (a1:X:Y)-[r]->()
WITH r, a1
LIMIT 1
MATCH (a1:Y)-[r]->(b2)
RETURN a1, r, b2
