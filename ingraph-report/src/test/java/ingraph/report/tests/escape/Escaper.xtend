package ingraph.report.tests.escape

class Escaper {

  def escape(String s) {
    s //
      .replaceAll('''#''', ''' no.''') //
      .replaceAll('''_''', '''\_''') //
      .replaceAll('''`''', "'") //
  }

  def cleanup(String s) {
    s //
      .replaceAll('''"""''', "") // """
      .replaceAll("'''", "") // '''
      .replaceAll("\n   ", "\n") // indentation
      .replaceAll("^\n", "") // newline at the start
      .replaceAll("\n$", "") // newline at the end
  }

  def unindent(String s) {
    s //
      .replaceAll("^      ", "") //
      .replaceAll("\n      ", "\n") //
  }

}