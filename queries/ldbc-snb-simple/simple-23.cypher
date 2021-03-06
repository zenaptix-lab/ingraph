// Holiday destinations
MATCH (homeCountry:Country)<-[:isPartOf]-(:City)<-[:isLocatedIn]-(:Person)<-[:hasCreator]-(message:Message)-[:isLocatedIn]->(country:Country)
WHERE homeCountry <> country
RETURN count(message) AS messageCount, country.name, message.creationDate
ORDER BY messageCount DESC, country.name ASC, message.creationDate DESC
LIMIT 100
