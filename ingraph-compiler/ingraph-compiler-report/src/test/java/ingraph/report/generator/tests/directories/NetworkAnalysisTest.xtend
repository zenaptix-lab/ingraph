package ingraph.report.generator.tests.directories

import org.junit.Test
import ingraph.report.generator.tests.ReportDirectoryTest

class NetworkAnalysisTest extends ReportDirectoryTest {

	@Test
	def void generateChapter() {
		toChapter("network-analysis", "Network analysis")
	}

}
