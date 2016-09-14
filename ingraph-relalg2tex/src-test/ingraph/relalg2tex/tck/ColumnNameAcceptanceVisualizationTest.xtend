package ingraph.relalg2tex.tck

import org.junit.Test

import ingraph.cypher2relalg.RelalgParser
import ingraph.relalg2tex.RelAlgTreeDrawer

class ColumnNameAcceptanceVisualizationTest {

    val static RelAlgTreeDrawer drawer = new RelAlgTreeDrawer(true)
    
    /*
    Scenario: Keeping used expression 1
    */
    @Test
    def void testColumnNameAcceptance_01() {
        val container = RelalgParser.parse('''
        MATCH (n)
        RETURN cOuNt( * )
        ''')
        drawer.serialize(container, "ColumnNameAcceptance_01")
    }

    /*
    Scenario: Keeping used expression 2
    */
    @Test
    def void testColumnNameAcceptance_02() {
        val container = RelalgParser.parse('''
        MATCH p = (n)-->(b)
        RETURN nOdEs( p )
        ''')
        drawer.serialize(container, "ColumnNameAcceptance_02")
    }

    /*
    Scenario: Keeping used expression 3
    */
    @Test
    def void testColumnNameAcceptance_03() {
        val container = RelalgParser.parse('''
        MATCH p = (n)-->(b)
        RETURN coUnt( dIstInct p )
        ''')
        drawer.serialize(container, "ColumnNameAcceptance_03")
    }

    /*
    Scenario: Keeping used expression 4
    */
    @Test
    def void testColumnNameAcceptance_04() {
        val container = RelalgParser.parse('''
        MATCH p = (n)-->(b)
        RETURN aVg(    n.aGe     )
        ''')
        drawer.serialize(container, "ColumnNameAcceptance_04")
    }

}