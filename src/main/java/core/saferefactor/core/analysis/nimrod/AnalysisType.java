package saferefactor.core.analysis.nimrod;

public enum AnalysisType {
	EQUIVALENTS, DUPLICATED, REDUNDANTS, ALL;

	public static AnalysisType get(String type) {
		switch (type) {
		case "equivalents":
			return EQUIVALENTS;
		case "duplicated":
			return DUPLICATED;
		case "redundants":
			return REDUNDANTS;
		default:
			return ALL;
		}
	}
}
