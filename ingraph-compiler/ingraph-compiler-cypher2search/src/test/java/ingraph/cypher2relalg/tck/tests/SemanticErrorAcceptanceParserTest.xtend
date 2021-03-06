package ingraph.cypher2relalg.tck.tests

import ingraph.cypher2relalg.Cypher2Relalg
import ingraph.cypher2relalg.tck.FailingTests
import ingraph.cypher2relalg.tck.RegressionTests
import ingraph.cypherparser.CypherParser
import ingraph.cypherparser.CypherUtil
import ingraph.relalg.util.RelalgUtil
import org.junit.Test
import org.junit.experimental.categories.Category

class SemanticErrorAcceptanceParserTest {
    
    /*
    Scenario: Handling property access on the Any type
    */
    @Test
    @Category(FailingTests)
    def void testSemanticErrorAcceptance_01() {
        val cypher = CypherParser.parseString('''
        WITH [{prop: 0}, 1] AS list
        RETURN (list[0]).prop
        ''')
        CypherUtil.save(cypher, "cypher-asts/tck/SemanticErrorAcceptance_01")
        val container = Cypher2Relalg.processCypher(cypher, "testSemanticErrorAcceptance_01")
        RelalgUtil.save(container, "relalg-models/tck/SemanticErrorAcceptance_01")
    }

    /*
    Scenario: Failing when performing property access on a non-map 1
    */
    @Test
    @Category(FailingTests)
    def void testSemanticErrorAcceptance_02() {
        val cypher = CypherParser.parseString('''
        WITH [{prop: 0}, 1] AS list
        RETURN (list[1]).prop
        ''')
        CypherUtil.save(cypher, "cypher-asts/tck/SemanticErrorAcceptance_02")
        val container = Cypher2Relalg.processCypher(cypher, "testSemanticErrorAcceptance_02")
        RelalgUtil.save(container, "relalg-models/tck/SemanticErrorAcceptance_02")
    }

    /*
    Scenario: Bad arguments for `range()`
    */
    @Test
    @Category(FailingTests)
    def void testSemanticErrorAcceptance_04() {
        val cypher = CypherParser.parseString('''
        RETURN range(2, 8, 0)
        ''')
        CypherUtil.save(cypher, "cypher-asts/tck/SemanticErrorAcceptance_04")
        val container = Cypher2Relalg.processCypher(cypher, "testSemanticErrorAcceptance_04")
        RelalgUtil.save(container, "relalg-models/tck/SemanticErrorAcceptance_04")
    }

}
