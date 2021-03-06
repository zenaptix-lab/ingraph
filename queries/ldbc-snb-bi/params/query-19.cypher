MATCH
  (:TagClass {id: $tagClass1})<-[:hasType]-(:Tag)<-[:hasTag]-(forum1:Forum),
  (:TagClass {id: $tagClass2})<-[:hasType]-(:Tag)<-[:hasTag]-(forum2:Forum),
  (forum1)-[:hasMember]->(person:Person)<-[:hasMember]-(forum2),
  (forum1)-[:hasMember]->(stranger:Person)<-[:hasMember]-(forum2)
WHERE NOT (person)-[:knows]-(stranger)
  AND person.birthday > $date
WITH person, stranger
MATCH (person)<-[:hasCreator]-(:Message)-[:replyOf]-(comment1:Comment)-[:hasCreator]->(stranger),
  (stranger)<-[:hasCreator]-(:Message)<-[:replyOf]-(comment2:Comment)-[:hasCreator]->(person)
RETURN person.id, count(stranger) AS strangersCount, count(comment1) + count(comment2) AS interactionCount
ORDER BY interactionCount DESC, person.id ASC
LIMIT 100
