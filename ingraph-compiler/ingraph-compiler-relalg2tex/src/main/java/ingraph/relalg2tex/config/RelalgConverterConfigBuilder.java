package ingraph.relalg2tex.config;

public class RelalgConverterConfigBuilder {
	private boolean includeCardinality;
	private boolean omitSchema;
	private boolean parentheses;
	private boolean includeProductionOperator;
	private boolean standaloneDocument;
	private boolean includeCommonVariables;
	private boolean consoleOutput;
	private boolean textualOperators;
	private boolean schemaIndices;

	public RelalgConverterConfigBuilder setIncludeCardinality(boolean includeCardinality) {
		this.includeCardinality = includeCardinality;
		return this;
	}

	public RelalgConverterConfigBuilder setOmitSchema(boolean omitSchema) {
		this.omitSchema = omitSchema;
		return this;
	}

	public RelalgConverterConfigBuilder setParentheses(boolean parentheses) {
		this.parentheses = parentheses;
		return this;
	}

	public RelalgConverterConfigBuilder setIncludeProductionOperator(boolean includeProductionOperator) {
		this.includeProductionOperator = includeProductionOperator;
		return this;
	}

	public RelalgConverterConfigBuilder setStandaloneDocument(boolean standaloneDocument) {
		this.standaloneDocument = standaloneDocument;
		return this;
	}

	public RelalgConverterConfigBuilder setIncludeCommonVariables(boolean includeCommonVariables) {
		this.includeCommonVariables = includeCommonVariables;
		return this;
	}

	public RelalgConverterConfigBuilder setConsoleOutput(boolean consoleOutput) {
		this.consoleOutput = consoleOutput;
		return this;
	}

	public RelalgConverterConfigBuilder setTextualOperators(boolean textualOperators) {
		this.textualOperators = textualOperators;
		return this;
	}

	public RelalgConverterConfigBuilder setSchemaIndices(boolean schemaIndices) {
		this.schemaIndices = schemaIndices;
		return this;
	}

	public RelalgConverterConfig build() {
		return new RelalgConverterConfig(includeCardinality, omitSchema, parentheses, includeProductionOperator, standaloneDocument, includeCommonVariables,
				consoleOutput, textualOperators, schemaIndices);
	}
}