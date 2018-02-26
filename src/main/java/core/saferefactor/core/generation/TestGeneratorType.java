package saferefactor.core.generation;

public enum TestGeneratorType {
	RANDOOP_ANT, RANDOOP, EVO_SUITE;
	
	public static TestGeneratorType get(String type) {
		switch (type) {
		case "randoop":
			return RANDOOP;
		case "evo_suite":
			return EVO_SUITE;
		default:
			return RANDOOP_ANT;
		}
	}
}
